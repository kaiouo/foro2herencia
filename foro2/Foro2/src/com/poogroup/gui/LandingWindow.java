package com.poogroup.gui;

import javax.swing.*;
import java.awt.*;

public class LandingWindow extends JFrame {

    ImageIcon icon = new ImageIcon("C:\\Users\\CommieTaco\\IdeaProjects\\Foro2\\src\\com\\poogroup\\media\\images\\TODOPC-Logo.png");
    private JPanel MainPanel = new JPanel(new BorderLayout());
    private JLabel LandingImage = new JLabel(icon);

    public LandingWindow(){
        ImageIcon icon = new ImageIcon("C:\\Users\\CommieTaco\\IdeaProjects\\Foro2\\src\\com\\poogroup\\media\\images\\TODOPC-Logo.png");
        this.setIconImage(icon.getImage());

        MainPanel.setBackground(new Color(51, 73, 153));

        setTitle("TODOPC Systems");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(800,700);
//        this.setLayout(new java.awt.GridLayout(1,1));
        MainPanel.add(LandingImage, BorderLayout.CENTER);
        this.add(MainPanel);
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }
}
