package JBorderLayoutPKG;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Border_Layouts {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(600, 600);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(true);
        frame.setLayout(new BorderLayout(10, 10));

        JPanel P1 = new JPanel();
        JPanel P2 = new JPanel();
        JPanel P3 = new JPanel();
        JPanel P4 = new JPanel();
        JPanel P5 = new JPanel();

        P1.setBackground(Color.BLACK);
        P2.setBackground(Color.BLUE);
        P3.setBackground(Color.CYAN);
        P4.setBackground(Color.DARK_GRAY);
        P5.setBackground(Color.GREEN);

        P1.setPreferredSize(new Dimension(100, 100));
        P2.setPreferredSize(new Dimension(100, 100));
        P3.setPreferredSize(new Dimension(100, 100));
        P4.setPreferredSize(new Dimension(100, 100));
        P5.setPreferredSize(new Dimension(100, 100));

        frame.add(P1, BorderLayout.WEST);
        frame.add(P2, BorderLayout.EAST);
        frame.add(P3, BorderLayout.NORTH);
        frame.add(P4, BorderLayout.SOUTH);
        frame.add(P5, BorderLayout.CENTER);

    }
}
