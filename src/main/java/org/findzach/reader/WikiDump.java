package org.findzach.reader;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import org.findzach.reader.def.DumpType;
import org.findzach.reader.def.impl.ItemDefinition;
import org.findzach.reader.def.impl.NPCDefinition;
import org.findzach.reader.def.impl.NPCDropDefinition;
import org.findzach.reader.gui.NaturalDumpTool;
import org.springframework.web.reactive.function.client.WebClient;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

import static org.findzach.reader.gui.NaturalDumpTool.tfCount;

/**
 * @author Zach S <zach@findzach.com>
 * @date 12/11/2020
 */
public class WikiDump {

    public static final DumpType DUMP_TYPE = DumpType.ITEM_DEFINITIONS;

    public static int progress = 0;

    public static int lastStop = 0;

    public static String PATH = "./data/saves/";

    private static WebClient dataConnection;

    public static List<NPCDefinition> readDefinitions = new LinkedList<NPCDefinition>();
    public static List<NPCDropDefinition> dropDefinitions = new LinkedList<>();
    public static List<ItemDefinition> itemDefinitions = new LinkedList<>();
    /**
     * Runner
     * @param args
     */
    public static void startDump() throws IOException {
        dataConnection = WebClient.create("https://api.osrsbox.com/items/");

        float downloaded = 50;
        float total = 200;
        float percent = (100 * downloaded) / total;
        System.out.println(String.format("%.0f%%",percent));

        switch(DUMP_TYPE) {
            case NPC_DEFINITIONS:

                for (int i = 1; i < 10567; i++) {
                    try {
                        Optional<NPCDefinition> npcDef = findOne(i);
                        if (npcDef.isPresent()) {
                            readDefinitions.add(npcDef.get());
                            System.out.println("Read NPC Definition");
                        } else continue;
                    } catch (Exception e) {
                        System.out.println("Error loading ID: " + i);
                        e.printStackTrace();
                        continue;
                    }
                }

                try {
                    writeNPCDefinitions();

                } catch (Exception e) {
                    System.out.println("Failed to write NPC Definitions!");
                }
                break;


            case ITEM_DEFINITIONS:

                int max = 25316;
                for (int i = lastStop == 0? 0: lastStop; i < max; i ++) {
                    if (NaturalDumpTool.stop) {
                        lastStop = i;
                        break;
                    }
                    try {
                        Optional<ItemDefinition> itemDef = findItemById(i);
                        if (itemDef.isPresent()) {
                            itemDefinitions.add(itemDef.get());

                            double percentage = (i * 100) / max;
                            tfCount.setText(i + "" + " ("+percentage+"%)");
                        }
                    } catch (Exception e) {
                        System.out.println("Error loading ID: " + i);
                        e.printStackTrace();
                        continue;
                    }
                }
                try {
                    writeItemDefinition();
                    System.out.println("Writing Item Definitions!");
                } catch (Exception e) {
                    System.out.println("Error Writing to file");
                }
                break;
            case NPC_DROP_DEFINITIONS:

                for (int i = 1; i < 10567; i ++) {
                    try {
                        Optional<NPCDropDefinition> npcDef = findDropsById(i);
                        if (npcDef.isPresent()) {
                            dropDefinitions.add(npcDef.get());
                        } else continue;
                    } catch (Exception e) {
                        System.out.println("Error loading ID: " + i);
                        continue;
                    }
                }
                try {
                    writeDropDefinition();
                } catch (Exception e) {

                }
                break;
        }
    }

    public static void writeItemDefinition() throws IOException {

        Gson builder = new GsonBuilder().setPrettyPrinting().create();
        JsonObject object = new JsonObject();

        File file = new File(PATH + "OSRSItemDefinition.json");

        String print = builder.toJson(itemDefinitions);

        FileWriter writer = new FileWriter(file);

        writer.write(print);
        writer.flush();

        file.mkdirs();
        file.createNewFile();
    }

    public static void writeDropDefinition() throws IOException {

        Gson builder = new GsonBuilder().setPrettyPrinting().create();
        JsonObject object = new JsonObject();

        File file = new File(PATH + "OSRSDropDefinitions.json");

        String print = builder.toJson(dropDefinitions);

        System.out.println(print);

        FileWriter writer = new FileWriter(file);

        writer.write(print);
        writer.flush();

        file.mkdirs();
        file.createNewFile();
    }

    public static void writeNPCDefinitions() throws IOException {

        Gson builder = new GsonBuilder().setPrettyPrinting().create();
        JsonObject object = new JsonObject();

        File file = new File(PATH + "npcDefinition.json");

        String print = builder.toJson(readDefinitions);

        System.out.println(print);

        FileWriter writer = new FileWriter(file);

        writer.write(print);
        writer.flush();

        file.mkdirs();
        file.createNewFile();
    }


    /**
     * The first Item Definition
     * @param id
     * @return
     */
    public static Optional<ItemDefinition> findItemById(int id) {
        if (dataConnection.get() != null) {
            return dataConnection.get()
                    .uri("https://api.osrsbox.com/items/" + id)
                    .retrieve()
                    .bodyToFlux(ItemDefinition.class).toStream().findFirst();
        }
        return Optional.empty();
    }

    /**
     * The first NPC with this exact ID.
     * @param id
     * @return
     */
    public static Optional<NPCDropDefinition> findDropsById(int id) {
        if (dataConnection.get() != null && dataConnection.get().uri("https://api.osrsbox.com/monsters/" + id) != null) {

            if (dataConnection.get().uri("https://api.osrsbox.com/monsters/" + id).retrieve() != null) {
                return dataConnection.get()
                        .uri("https://api.osrsbox.com/monsters/" + id)
                        .retrieve()
                        .bodyToFlux(NPCDropDefinition.class).toStream().findFirst();
            }
        }
        return Optional.empty();
    }

    /**
     * The first NPC with this exact ID.
     * @param id
     * @return
     */
    public static Optional<NPCDefinition> findOne(int id) {
        if (dataConnection.get() != null && dataConnection.get().uri("https://api.osrsbox.com/monsters/" + id) != null) {
            return dataConnection.get()
                    .uri("https://api.osrsbox.com/monsters/" + id)
                    .retrieve()
                    .bodyToFlux(NPCDefinition.class).toStream().findFirst();
        }
        return Optional.empty();
    }

}
