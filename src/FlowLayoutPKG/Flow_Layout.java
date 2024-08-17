package FlowLayoutPKG;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Flow_Layout {
    public static void main(String[] args) {
        JPanel panel = new JPanel();
        panel.setBackground(Color.DARK_GRAY);
        panel.setLayout(new FlowLayout(FlowLayout.RIGHT));
        panel.setPreferredSize(new Dimension(300, 300));

        JButton button1 = new JButton("1");
        button1.setFocusable(false);
        panel.add(button1);

        JButton button2 = new JButton("2");
        button2.setFocusable(false);
        panel.add(button2);

        JButton button3 = new JButton("3");
        button3.setFocusable(false);
        panel.add(button3);

        JButton button4 = new JButton("4");
        button4.setFocusable(false);
        panel.add(button4);

        JButton button5 = new JButton("5");
        button5.setFocusable(false);
        panel.add(button5);

        JButton button6 = new JButton("6");
        button6.setFocusable(false);
        panel.add(button6);

        JButton button7 = new JButton("7");
        button7.setFocusable(false);
        panel.add(button7);

        JButton button8 = new JButton("8");
        button8.setFocusable(false);
        panel.add(button8);

        JButton button9 = new JButton("9");
        button9.setFocusable(false);
        panel.add(button9);

        JFrame frame = new JFrame();
        frame.setSize(600, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(true);
        frame.setLayout(new FlowLayout(FlowLayout.LEFT));
        frame.add(panel);
        frame.setVisible(true);
    }
}
