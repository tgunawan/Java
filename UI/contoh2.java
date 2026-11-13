package UI;

import javax.swing.*;
import java.awt.GridLayout;

public class contoh2 {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(()->{
            JFrame frame=new JFrame("Aplikasi pertama Jojo");

            frame.setSize(400,400);

            JLabel label=new JLabel("Nama: ");
            JTextField textField=new JTextField(20);
            JButton button = new JButton("Tampilkan");
            
            JLabel label2=new JLabel("Nama2: ");
            JTextField textField2=new JTextField(20); //input text 1 baris
            JButton button2 = new JButton("Tampilkan");

            JTextArea areaCatatan = new JTextArea(10,30);
            String catatan = areaCatatan.getText();

            JScrollPane scrollPane = new JScrollPane(areaCatatan,
                JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,
                JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED
        );

            JCheckBox checkPenting = new    JCheckBox("Penting");
            boolean isPenting = checkPenting.isSelected();



            JPanel panel=new JPanel();
            panel.add(label);
            panel.add(textField);
            panel.add(button);
            panel.add(scrollPane);
            panel.add(checkPenting);

            // JPanel panel2=new JPanel();
            // panel2.add(label2);
            // panel2.add(textField2);
            // panel2.add(button2);

            JPanel container = new JPanel(new GridLayout(2, 1));
            container.add(panel);
            // container.add(panel2);
            frame.add(container);

            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // program berhenti saat UI di close
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);

        }); 
    }
}
