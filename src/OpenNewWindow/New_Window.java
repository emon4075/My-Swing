package OpenNewWindow;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class New_Window {
    JFrame frame = new JFrame();
    JLabel label = new JLabel();

    New_Window() {

        label.setBounds(10, 10, 100, 100);
        label.setText("Hello");
        label.setFont(new Font("MV Boli", Font.PLAIN, 30));
        label.setForeground(Color.ORANGE);

        frame.setSize(500, 500);
        frame.setResizable(true);
        frame.add(label);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}
