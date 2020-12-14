package org.findzach.reader.gui;

import org.findzach.reader.WikiDump;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.IOException;
import javax.swing.*;

import static org.findzach.reader.WikiDump.startDump;

/**
 * @author Zach S <zach@findzach.com>
 * @date 12/14/2020
 */
public class NaturalDumpTool extends JFrame {

        public static boolean stop = false;
        public static JTextField tfCount;
        private int count = 1;

        /** Constructor to setup the GUI components */
        public NaturalDumpTool() {
            Container cp = getContentPane();
            cp.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));
            cp.add(new JLabel("WikiDump Progress"));
            int total = 25316;
            double percentage = (WikiDump.progress / total) * 100;
            tfCount = new JTextField(""+ WikiDump.progress + " - (" + percentage + "%)", 10);
            tfCount.setEditable(false);
            cp.add(tfCount);

            JButton btnStart = new JButton("Start Dump");
            cp.add(btnStart);
            btnStart.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent evt) {
                    stop = false;
                    Thread t = new Thread(() -> {  // override the run() for the running behaviors
                        try {
                            startDump();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    });
                    t.start();
                }
            });

            JButton btnStop = new JButton("Stop Dump");
            cp.add(btnStop);
            btnStop.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent evt) {
                    stop = true;
                }
            });

            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setTitle("Natural Dump Tool");
            setSize(300, 120);
            setVisible(true);
        }

        /** The entry main method */
        public static void main(String[] args) {
            String[] choices = { "Item Def", "NPC Drop Def", "Slayer Def", "NPC Stats Def", "Equipment Def", "F" };
            String input = (String) JOptionPane.showInputDialog(null, "Choose a definition",
                    "Select Type of Definition to Scrape", JOptionPane.QUESTION_MESSAGE, null,
                    choices,
                    choices[1]);

            // Run GUI codes in Event-Dispatching thread for thread safety
            javax.swing.SwingUtilities.invokeLater(new Runnable() {
                @Override
                public void run() {
                    new NaturalDumpTool();  // Let the constructor do the job
                }
            });
        }

}
