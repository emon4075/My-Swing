package JTextFieldPKG;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class My_Frame extends JFrame implements ActionListener {
    JTextField textField;
    JButton button;

    My_Frame() {
        this.setLayout(new FlowLayout());

        button = new JButton("Submit");
        button.addActionListener(this);
        button.setFocusable(false);
        button.setFont(new Font("MV Boli", Font.PLAIN, 30));

        textField = new JTextField(); // Initialize the textField
        textField.setPreferredSize(new Dimension(200, 60));
        textField.setBackground(Color.BLACK);
        textField.setFont(new Font("Consolas", Font.BOLD, 30));
        textField.setForeground(Color.green);
        textField.setCaretColor(Color.white);

        this.add(button);
        this.add(textField); // Add textField before packing
        this.pack();
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button) {
            System.out.println("Hello " + textField.getText());
            button.setEnabled(false);
            textField.setEditable(false);
        }
    }

    public static void main(String[] args) {
        new My_Frame();
    }
}
