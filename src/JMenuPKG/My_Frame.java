package JMenuPKG;

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class My_Frame extends JFrame implements ActionListener {
    JMenuBar menuBar;
    JMenu fileMenu, editMenu, selectionMenu;
    JMenuItem saveItem, loadItem, exitItem;
    ImageIcon saveIcon, loadIcon, exitIcon;

    My_Frame() {
        this.setSize(500, 500);
        this.setResizable(true);
        this.setLayout(new FlowLayout());
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        saveIcon = new ImageIcon("E://Swing//src//JMenuPKG//save.png");
        loadIcon = new ImageIcon("E://Swing//src//JMenuPKG//loading.png");
        exitIcon = new ImageIcon("E://Swing//src//JMenuPKG//logout.png");

        saveItem = new JMenuItem();
        saveItem.addActionListener(this);
        saveItem.setText("Save");
        saveItem.setMnemonic(KeyEvent.VK_S); // ALT+S || S
        saveItem.setIcon(saveIcon);

        loadItem = new JMenuItem();
        loadItem.addActionListener(this);
        loadItem.setText("Load");
        loadItem.setMnemonic(KeyEvent.VK_L);
        loadItem.setIcon(loadIcon);

        exitItem = new JMenuItem();
        exitItem.addActionListener(this);
        exitItem.setText("Exit");
        exitItem.setMnemonic(KeyEvent.VK_E);
        exitItem.setIcon(exitIcon);

        menuBar = new JMenuBar();

        fileMenu = new JMenu("File");
        fileMenu.setMnemonic(KeyEvent.VK_F);
        editMenu = new JMenu("Edit");
        editMenu.setMnemonic(KeyEvent.VK_C);
        selectionMenu = new JMenu("Selection");
        selectionMenu.setMnemonic(KeyEvent.VK_D);

        fileMenu.add(saveItem);
        fileMenu.add(loadItem);
        fileMenu.add(exitItem);

        menuBar.add(fileMenu);
        menuBar.add(editMenu);
        menuBar.add(selectionMenu);

        this.setJMenuBar(menuBar);
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == saveItem) {
            System.out.println("Item Saved");
        } else if (e.getSource() == loadItem) {
            System.out.println("Item Loaded");
        } else {
            System.exit(0);
        }
    }

    public static void main(String[] args) {
        new My_Frame();
    }
}
