package JFramesPKG;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
    
public class Frames {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setTitle("My Frame");
        frame.setSize(420, 420);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        ImageIcon image = new ImageIcon("E://Swing//src//JFramesPKG//goat.png");
        frame.setIconImage(image.getImage());

        // frame.getContentPane().setBackground(Color.LIGHT_GRAY);
        frame.getContentPane().setBackground(new Color(0, 0, 0));

    }
}
