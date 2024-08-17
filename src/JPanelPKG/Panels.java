package JPanelPKG;

import javax.swing.*;
import java.awt.*;

public class Panels {
    public static void main(String[] args) {
        /* Image */
        ImageIcon image = new ImageIcon("E://Swing//src//JPanelPKG//thumb.png");

        /* Label */
        JLabel label = new JLabel();
        label.setText("Hello");
        label.setIcon(image);
        label.setVerticalTextPosition(JLabel.BOTTOM);
        label.setHorizontalTextPosition(JLabel.CENTER);
        // label.setVerticalAlignment(JLabel.TOP);
        // label.setHorizontalAlignment(JLabel.LEFT);
        label.setBounds(50, 10, 100, 100);

        /* Panel */
        JPanel redPanel = new JPanel();
        redPanel.setBackground(Color.red);
        redPanel.setBounds(0, 0, 150, 150);

        JPanel bluePanel = new JPanel();
        bluePanel.setBackground(Color.blue);
        bluePanel.setBounds(150, 0, 150, 150);

        JPanel greenPanel = new JPanel();
        greenPanel.setBackground(Color.green);
        greenPanel.setBounds(0, 150, 300, 150);
        greenPanel.setLayout(null);

        /* JFrame Creation */
        JFrame frame = new JFrame();
        frame.setSize(500, 500);
        frame.setLayout(null);
        frame.setResizable(true);
        frame.setVisible(true);
        frame.setTitle("Panel");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        greenPanel.add(label);
        frame.add(redPanel);
        frame.add(bluePanel);
        frame.add(greenPanel);
    }
}
