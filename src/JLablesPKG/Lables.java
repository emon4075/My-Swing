package JLablesPKG;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.Border;

public class Lables {
    public static void main(String[] args) {
        /* Importing The Image */
        ImageIcon image = new ImageIcon("E://Swing//src//JLablesPKG//GOAT.png");

        /* Border Creation */
        Border border = BorderFactory.createLineBorder(Color.CYAN, 5);

        /* JLabel */
        JLabel label = new JLabel();
        label.setText("Hello GOAT");
        label.setIcon(image);
        label.setHorizontalTextPosition(JLabel.CENTER); // Center of The Label
        label.setVerticalTextPosition(JLabel.TOP);
        label.setForeground(new Color(167, 65, 67));
        label.setFont(new Font("MV Boli", Font.PLAIN, 20));
        label.setIconTextGap(20);
        label.setBackground(Color.DARK_GRAY);
        label.setOpaque(true);
        label.setBorder(border);
        label.setVerticalAlignment(JLabel.CENTER);
        label.setHorizontalAlignment(JLabel.CENTER);
        // label.setBounds(100, 200, 300, 300);

        /* Setting The Java JFrame */
        JFrame frame = new JFrame();
        frame.setSize(800, 800);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(true);
        frame.add(label);
        // frame.setLayout(null);
    }
}
