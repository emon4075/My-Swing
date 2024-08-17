package OpenNewWindow;

import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Launch_Page implements ActionListener {
    JFrame frame = new JFrame();
    JButton button = new JButton();

    Launch_Page() {
        button.setBounds(200, 200, 200, 80);
        button.setText("New Window");
        button.setFocusable(false);
        button.addActionListener(this);

        frame.add(button);
        frame.setSize(600, 600);
        frame.setLayout(null);
        frame.setResizable(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    @SuppressWarnings("unused")
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button) {
            frame.dispose();
            New_Window NW = new New_Window();
            // button.setEnabled(false);
        }
    }
}
