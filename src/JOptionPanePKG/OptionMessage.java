package JOptionPanePKG;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class OptionMessage {
    public static void main(String[] args) {
        // JOptionPane.showMessageDialog(null, "I Love You 💖", "Plain",JOptionPane.PLAIN_MESSAGE);
        // JOptionPane.showMessageDialog(null, "Information", "Information Dialog",JOptionPane.INFORMATION_MESSAGE);
        // JOptionPane.showMessageDialog(null, "Error Occured", "Error Dialog", JOptionPane.ERROR_MESSAGE);
        // JOptionPane.showMessageDialog(null, "Fcuked?", "Question Dialog", JOptionPane.QUESTION_MESSAGE);
        // JOptionPane.showMessageDialog(null, "I Warn You. I Will Break Your Heart", "Warning Dialog", JOptionPane.WARNING_MESSAGE);


        // JOptionPane.showConfirmDialog(null, "Can You Guess?", "Confirm Dialog", JOptionPane.YES_NO_CANCEL_OPTION);
        // System.out.println("Hello " + JOptionPane.showInputDialog("Enter Name?"));

        while (true) {
            String[] OPT = {"Yes","No","Very Good","EXIT"};
            ImageIcon icon = new ImageIcon("E://Swing//src//JOptionPanePKG//bow.png");
            int Response = JOptionPane.showOptionDialog(null, "Choose", "Own Option Dialog", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE, icon, OPT, 0);
            System.out.println(OPT[Response]);
            if (Response==3) {
                break;
            }
        }
    }
}
