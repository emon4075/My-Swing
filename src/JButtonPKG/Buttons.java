package JButtonPKG;

import javax.swing.*;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.*;

public class Buttons implements ActionListener {
    JButton button;
    JLabel label;

    public static void main(String[] args) {
        // Create an instance of the Buttons class
        Buttons buttons = new Buttons();

        // Load the image icon
        ImageIcon image = new ImageIcon("E://Swing//src//JButtonPKG//GOAT.png");

        // Create and configure the label
        buttons.label = new JLabel();
        buttons.label.setIcon(image);
        buttons.label.setBounds(100, 200, 300, 100);
        buttons.label.setVisible(false);

        // Create and configure the button
        buttons.button = new JButton();
        buttons.button.setBounds(100, 100, 200, 80);
        buttons.button.setText("Click Me");
        buttons.button.setFocusable(false);
        buttons.button.setIcon(image);
        buttons.button.setVerticalTextPosition(JButton.BOTTOM);
        buttons.button.setHorizontalTextPosition(JButton.CENTER);
        buttons.button.setFont(new Font("MV Boli", Font.BOLD, 20));
        buttons.button.setIconTextGap(-5);
        buttons.button.setForeground(Color.MAGENTA);
        buttons.button.setBackground(Color.YELLOW);
        buttons.button.setBorder(BorderFactory.createLineBorder(Color.RED, 5));

        // Attach the action listener to the button
        buttons.button.addActionListener(buttons);

        // Create and configure the frame
        JFrame frame = new JFrame();
        frame.setSize(600, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Button");
        frame.setLayout(null);

        // Add components to the frame
        frame.add(buttons.label); // Add the label first
        frame.add(buttons.button); // Add the button second
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button) {
            label.setVisible(true);
        }
    }
}
