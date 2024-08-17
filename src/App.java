import java.awt.*;
import javax.swing.*;

public class App {
    public static void main(String[] args) {
        ImageIcon image = new ImageIcon("E://Swing//src//JLablesPKG//GOAT.png");
        ImageIcon img = new ImageIcon("E://Swing//src//JPanelPKG//thumb.png");

        JLabel label = new JLabel();
        label.setText("Siuuu");
        label.setIcon(img);
        label.setVerticalTextPosition(JLabel.TOP);
        label.setHorizontalTextPosition(JLabel.CENTER);
        label.setForeground(Color.cyan);
        label.setFont(new Font("Monospace", Font.PLAIN, 30));
        // label.setVerticalAlignment(JLabel.BOTTOM);
        // label.setHorizontalAlignment(JLabel.LEFT);
        label.setBounds(10, 30, 90, 90);

        JPanel panel1 = new JPanel(new BorderLayout());
        panel1.setBackground(new Color(103, 65, 136));
        panel1.setBounds(0, 0, 300, 200);

        JPanel panel2 = new JPanel();
        panel2.setBackground(new Color(200, 161, 224));
        panel2.setBounds(300, 0, 300, 200);

        JPanel panel3 = new JPanel();
        panel3.setBackground(new Color(226, 191, 217));
        panel3.setBounds(0, 200, 300, 200);

        JPanel panel4 = new JPanel();
        panel4.setBackground(new Color(247, 239, 229));
        panel4.setBounds(300, 200, 300, 200);

        JFrame frame = new JFrame();
        frame.setSize(600, 430);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setResizable(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("My Frame");
        frame.setIconImage(image.getImage());
        frame.add(panel1);
        frame.add(panel2);
        frame.add(panel3);
        frame.add(panel4);

        // panel1.add(label, BorderLayout.CENTER);
        panel2.add(label);
    }
}
