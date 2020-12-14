package org.findzach.reader.def;

/**
 * @author Zach S <zach@findzach.com>
 * @date 12/11/2020
 */
public class NPCDrop {

    private int id;
    private String name;
    private boolean members;
    private String quantity;
    private boolean noted;
    private float rarity;
    private String drop_requirements;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isMembers() {
        return members;
    }

    public void setMembers(boolean members) {
        this.members = members;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public boolean isNoted() {
        return noted;
    }

    public void setNoted(boolean noted) {
        this.noted = noted;
    }

    public float getRarity() {
        return rarity;
    }

    public void setRarity(float rarity) {
        this.rarity = rarity;
    }

    public String getDrop_requirements() {
        return drop_requirements;
    }

    public void setDrop_requirements(String drop_requirements) {
        this.drop_requirements = drop_requirements;
    }
}
