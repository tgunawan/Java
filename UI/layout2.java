package UI;

import java.awt.*;
import javax.swing.*;

public class layout2 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Aplikasi Layout 2 Jojo"); // window utama
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800,600);
        frame.setLocationRelativeTo(null);

        //panel utama
        JPanel mainPanel = new JPanel(new BorderLayout(12,12));
        mainPanel.setBorder(BorderFactory.createEmptyBorder(12,12,12,12));        

        //Panel kiri
        JPanel leftPanel = new JPanel();
        leftPanel.setLayout(new BoxLayout(leftPanel, BoxLayout.Y_AXIS));
        leftPanel.setPreferredSize(new Dimension(210,0));
        leftPanel.setBorder(BorderFactory.createTitledBorder("Menu Kiri"));

        JButton btn1 = new JButton("Tombol1");
        leftPanel.add(btn1);
        JButton btn2 = new JButton("Tombol1");
        leftPanel.add(btn2);


        //===================================================================

        //Panel Kanan (2kotak besar atas , bawah)
        JPanel rightPanel = new JPanel(new GridLayout(2,1,0,12)); // row,column, Hgap , Vgap
        // rightPanel.setPreferredSize(new Dimension(210,0));

        // Kotak kanan atas
        JPanel topRightPanel = new JPanel(new BorderLayout(6,6)); // Hgap, Vgap
        topRightPanel.setBorder(BorderFactory.createTitledBorder("Area atas"));

        // Kotak kanan bawah
        JPanel bottomRightPanel = new JPanel(new BorderLayout(6,6));
        bottomRightPanel.setBorder(BorderFactory.createTitledBorder("Area bawah"));

        //=================================================================================
        // kanan atas
        JLabel topLabel = new JLabel("Tes Label - input:");
        JTextArea topTextArea = new JTextArea();
        topTextArea.setLineWrap(true);
        topTextArea.setWrapStyleWord(true);
        topRightPanel.add(topLabel,BorderLayout.NORTH);
        topRightPanel.add(new JScrollPane(topTextArea),BorderLayout.CENTER);
        
        //=======================================================================
        // kanan bawah
        JTextArea bottomTextArea = new JTextArea();
        bottomTextArea.setLineWrap(true);
        bottomTextArea.setWrapStyleWord(true);
        JButton actionButton = new JButton("Proses");

        actionButton.addActionListener(e -> {
            topLabel.setText("Update Label berhasil"+ bottomTextArea.getText().trim());
        });

        bottomRightPanel.add(new JScrollPane(bottomTextArea),BorderLayout.CENTER);
        bottomRightPanel.add(actionButton,BorderLayout.SOUTH);
        //=================================================================
        rightPanel.add(topRightPanel);
        rightPanel.add(bottomRightPanel);
        
        mainPanel.add(leftPanel, BorderLayout.WEST);
        mainPanel.add(rightPanel, BorderLayout.EAST);

        frame.add(mainPanel);
        frame.setVisible(true);

    }
}
