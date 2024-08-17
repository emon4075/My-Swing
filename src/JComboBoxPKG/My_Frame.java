package JComboBoxPKG;

import javax.swing.*;
import java.awt.event.*;

public class My_Frame extends JFrame implements ActionListener {

    @SuppressWarnings("rawtypes")
    JComboBox comboBox;

    @SuppressWarnings({ "rawtypes", "unchecked" })
    My_Frame() {
        this.setSize(400, 400);
        this.setResizable(true);
        this.setLayout(null); // Use null layout for absolute positioning

        // Create a JLabel to act as the title
        JLabel titleLabel = new JLabel("Choose Your Idol:");
        titleLabel.setBounds(100, 70, 200, 30);
        this.add(titleLabel);

        String[] Idol = { "Ronaldo", "Messi", "Mbappe" };
        // Integer[] Idol = { 7, 10, 9 };
        comboBox = new JComboBox(Idol);
        comboBox.setBounds(100, 100, 200, 30); // Adjust the bounds as needed
        comboBox.addActionListener(this);

        /*
         * comboBox.setEditable(true);
         * comboBox.addItem("Neymar");
         * comboBox.insertItemAt("Neymar", 3);
         * comboBox.setSelectedIndex(1);
         * comboBox.removeItem("Neymar");
         * comboBox.removeItemAt(2);
         */

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.add(comboBox);
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == comboBox) {
            System.out.println(comboBox.getSelectedItem());
        }
    }

    public static void main(String[] args) {
        new My_Frame();
    }

}
