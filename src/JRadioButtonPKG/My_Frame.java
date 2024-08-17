package JRadioButtonPKG;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class My_Frame extends JFrame implements ActionListener {

    JRadioButton confusedButton, emojiButton, inLoveButton;
    ImageIcon confusedIcon, emojiIcon, inLoveIcon;

    My_Frame() {
        this.setResizable(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        confusedIcon = new ImageIcon("E://Swing//src//JRadioButtonPKG//confused.png");
        emojiIcon = new ImageIcon("E://Swing//src//JRadioButtonPKG//emoji.png");
        inLoveIcon = new ImageIcon("E://Swing//src//JRadioButtonPKG//in-love.png");

        confusedButton = new JRadioButton("Confused");
        confusedButton.setIcon(confusedIcon);
        confusedButton.addActionListener(this);

        emojiButton = new JRadioButton("Emoji");
        emojiButton.setIcon(emojiIcon);
        emojiButton.addActionListener(this);

        inLoveButton = new JRadioButton("In-Love");
        inLoveButton.setIcon(inLoveIcon);
        inLoveButton.addActionListener(this);

        // Selects Only One Button
        ButtonGroup group = new ButtonGroup();
        group.add(confusedButton);
        group.add(emojiButton);
        group.add(inLoveButton);

        this.add(confusedButton);
        this.add(emojiButton);
        this.add(inLoveButton);
        this.setTitle("Mood");
        this.pack();
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == confusedButton) {
            System.out.println("I Am Confused");
        } else if (e.getSource() == emojiButton) {
            System.out.println("I Am Crying");
        } else {
            System.out.println("I Love You");
        }
    }

    public static void main(String[] args) {
        new My_Frame();
    }
}
