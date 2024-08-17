package JProgessBarPKG;

import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {
    JProgressBar bar;

    MyFrame() {
        this.setSize(500, 500);
        this.setResizable(true);
        this.setLayout(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        bar = new JProgressBar();
        bar.setBounds(0, 100, 500, 50);
        bar.setValue(0);
        bar.setStringPainted(true);
        bar.setBackground(Color.BLACK);
        bar.setFont(new Font("MV Boli", Font.PLAIN, 30));
        bar.setForeground(Color.GREEN);

        this.add(bar);
        this.setVisible(true);
        Fill();
        bar.setString("Done");
    }

    public void Fill() {
        for (int i = 0; i <= 100;) {
            bar.setValue(i);
            if (i < 50) {
                i += 2;
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            } else {
                i++;
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

        }
    }

    public static void main(String[] args) {
        new MyFrame();
    }
}
