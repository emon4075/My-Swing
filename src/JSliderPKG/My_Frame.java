package JSliderPKG;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.*;
import javax.swing.event.*;

public class My_Frame extends JFrame implements ChangeListener {
    JLabel label;
    JPanel panel;
    JSlider slider;

    My_Frame() {

        label = new JLabel();

        panel = new JPanel();

        label.setFont(new Font("Consolas", Font.PLAIN, 30));
        label.setBounds(100, 100, 50, 30);

        slider = new JSlider(0, 100, 20);
        slider.setPreferredSize(new Dimension(400, 200));
        slider.setPaintTicks(true);
        slider.setMinorTickSpacing(10);
        slider.setPaintTicks(true);
        slider.setMajorTickSpacing(20);
        slider.setPaintLabels(true);
        slider.setFont(new Font("MV Boli", Font.PLAIN, 20));
        slider.setOrientation(SwingConstants.VERTICAL);
        slider.addChangeListener(this);

        panel.setBounds(100, 200, 400, 400);
        panel.add(slider);
        panel.add(label);

        this.setSize(600, 600);
        this.setTitle("Slider Demo");
        this.setResizable(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);

        this.add(panel);

        this.setVisible(true);
    }

    @Override
    public void stateChanged(ChangeEvent e) {
        if (e.getSource() == slider) {
            label.setForeground(Color.ORANGE);
            label.setText("C = " + slider.getValue());
        }
    }

    public static void main(String[] args) {
        new My_Frame();
    }
}
