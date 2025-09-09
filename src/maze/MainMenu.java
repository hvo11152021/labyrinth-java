/*
This class is a main swing JFrame that responsible for opening different maze
game upon a character being chosen. A string mcharacter is declared and will be
set as different colour name everytime a string form the combobox list is
have a maze with the white character, but by selecting different choice in
JComboBox1, a different maze class will be called, with a different character in 
it. JButton2 on the other hand, will disposed itself, while close down the
program upon clicking.
*/
package maze;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.awt.Rectangle;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;

public class MainMenu extends javax.swing.JFrame {
    public static String mcharacter;

    private JButton jButton1;
    private JButton jButton2;
    private JComboBox<String> jComboBox1;
    private JLabel jLabel1;
    private JLabel jLabel2;
    private JLabel jLabel4;

    public MainMenu() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Maze Game");
        setBounds(new Rectangle(0, 0, 0, 0));
        setMaximumSize(new Dimension(600, 600));
        setMinimumSize(new Dimension(465, 488));
        setSize(new Dimension(465, 488));
        setLayout(null);

        // Title label
        jLabel2 = new JLabel("Tron Dungeon", SwingConstants.CENTER);
        jLabel2.setFont(new Font("Lucida Console", Font.BOLD, 18));
        jLabel2.setForeground(Color.WHITE);
        jLabel2.setOpaque(true);
        jLabel2.setBackground(new Color(0, 0, 51));
        jLabel2.setBorder(BorderFactory.createLineBorder(Color.WHITE));
        jLabel2.setBounds(152, 60, 160, 24);
        add(jLabel2);

        // Character select label
        jLabel1 = new JLabel("Select your character", SwingConstants.CENTER);
        jLabel1.setFont(new Font("Lucida Console", Font.PLAIN, 14));
        jLabel1.setForeground(Color.WHITE);
        jLabel1.setOpaque(true);
        jLabel1.setBackground(new Color(0, 0, 51));
        jLabel1.setBorder(BorderFactory.createLineBorder(Color.WHITE));
        jLabel1.setBounds(132, 100, 200, 20);
        add(jLabel1);

        // Combo box
        jComboBox1 = new JComboBox<>(new String[]{"Skeleton", "Warrior", "Knight", "Archer"});
        jComboBox1.setBounds(182, 140, 100, 24);
        jComboBox1.addActionListener(evt -> {
            String item = (String) jComboBox1.getSelectedItem();
            switch (item) {
                case "Skeleton": mcharacter = "w"; break;
                case "Warrior": mcharacter = "o"; break;
                case "Knight": mcharacter = "b"; break;
                case "Archer": mcharacter = "g"; break;
            }
        });
        add(jComboBox1);

        // Start button
        jButton1 = new JButton("Start");
        jButton1.setBounds(102, 300, 120, 28);
        jButton1.setFont(new Font("Press Start 2P", Font.PLAIN, 12));
        jButton1.setBackground(Color.BLACK);
        jButton1.setForeground(Color.WHITE);
        jButton1.setFocusPainted(false);
        jButton1.setBorder(BorderFactory.createLineBorder(Color.WHITE, 3));
        jButton1.setOpaque(true);

        jButton1.addActionListener(evt -> {
            if ("w".equals(mcharacter)) {
                openMazeWindow(new Maze(), new MyPanel());
            } else if ("o".equals(mcharacter)) {
                openMazeWindow(new Maze2(), new MyPanel2());
            } else if ("b".equals(mcharacter)) {
                openMazeWindow(new Maze3(), new MyPanel3());
            } else if ("g".equals(mcharacter)) {
                openMazeWindow(new Maze4(), new MyPanel4());
            } else {
                openMazeWindow(new Maze(), new MyPanel());
            }
            dispose();
        });

        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton1.setBackground(new Color(51, 255, 51));
                jButton1.setForeground(Color.BLACK);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton1.setBackground(Color.BLACK);
                jButton1.setForeground(Color.WHITE);
            }
        });
        add(jButton1);

        // Exit button
        jButton2 = new JButton("Exit");
        jButton2.setBounds(242, 300, 120, 28);
        jButton2.setFont(new Font("Press Start 2P", Font.PLAIN, 12));
        jButton2.setBackground(Color.BLACK);
        jButton2.setForeground(Color.WHITE);
        jButton2.setFocusPainted(false);
        jButton2.setBorder(BorderFactory.createLineBorder(Color.WHITE, 3));
        jButton2.setOpaque(true);

        jButton2.addActionListener(evt -> dispose());

        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton2.setBackground(new Color(255, 51, 51));
                jButton2.setForeground(Color.BLACK);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton2.setBackground(Color.BLACK);
                jButton2.setForeground(Color.WHITE);
            }
        });
        add(jButton2);

        // Background image (dynamic resize)
        ImageIcon bgIcon = new ImageIcon(getClass().getResource("/maze/tron light wall.png"));
        Image scaledImg = bgIcon.getImage().getScaledInstance(465, 488, Image.SCALE_SMOOTH);
        jLabel4 = new JLabel(new ImageIcon(scaledImg));
        jLabel4.setBounds(0, 0, 465, 488);
        add(jLabel4);

        setLocationRelativeTo(null);
    }

    private void openMazeWindow(JFrame frame, JPanel panel) {
        frame.setTitle("Main Menu");
        frame.add(panel);
        frame.setSize(465, 488);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    // 🔹 Your version of main
    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainMenu().setVisible(true);
            }
        });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jToggleButton1 = new javax.swing.JToggleButton();
        jPanel1 = new javax.swing.JPanel();
        jToggleButton2 = new javax.swing.JToggleButton();

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        jToggleButton1.setText("jToggleButton1");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jToggleButton2.setText("jToggleButton2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Maze Game");
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setMaximumSize(new java.awt.Dimension(600, 600));
        setMinimumSize(new java.awt.Dimension(100, 100));
        setPreferredSize(null);
        setSize(new java.awt.Dimension(350, 350));
        getContentPane().setLayout(null);

        setSize(new java.awt.Dimension(316, 339));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JToggleButton jToggleButton2;
    // End of variables declaration//GEN-END:variables
}
