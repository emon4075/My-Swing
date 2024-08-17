package JCheckBoxPKG;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;

public class MyFrame extends JFrame implements ActionListener {
    JFrame frame;
    JCheckBox checkBox;
    JButton button;
    ImageIcon I1, I2;

    MyFrame() {
        this.setLayout(new FlowLayout());
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        I1 = new ImageIcon("E://Swing//src//JCheckBoxPKG//check.png");
        I2 = new ImageIcon("E://Swing//src//JCheckBoxPKG//close.png");

        button = new JButton("Submit");
        button.setFocusable(false);
        button.setFont(new Font("MV Boli", Font.PLAIN, 30));
        button.setForeground(Color.GREEN);
        button.setBackground(Color.BLACK);
        button.addActionListener(this);

        checkBox = new JCheckBox();
        checkBox.setText("Not A Robot");
        checkBox.setFocusable(false);
        checkBox.setFont(new Font("Consolas", Font.PLAIN, 30));
        checkBox.setForeground(Color.GREEN);
        checkBox.setBackground(Color.BLACK);
        checkBox.setIcon(I1);
        checkBox.setSelectedIcon(I2);

        this.add(button);
        this.add(checkBox);
        this.pack();
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button) {
            System.out.println(checkBox.isSelected());
        }
    }

    @SuppressWarnings("unused")
    public static void main(String[] args) {
        MyFrame MF = new MyFrame();
    }
}
