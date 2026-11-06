package UI;

import javax.swing.*;
import java.awt.GridLayout;

public class contoh2 {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(()->{
            JFrame frame=new JFrame("Aplikasi pertama Jojo");

            frame.setSize(400,200);

            JLabel label=new JLabel("Nama: ");
            JTextField textField=new JTextField(20);
            JButton button = new JButton("Tampilkan");
            
            JLabel label2=new JLabel("Nama: ");
            JTextField textField2=new JTextField(20);
            JButton button2 = new JButton("Tampilkan");

            JPanel panel=new JPanel();
            panel.add(label);
            panel.add(textField);
            panel.add(button);

            JPanel panel2=new JPanel();
            panel2.add(label2);
            panel2.add(textField2);
            panel2.add(button2);

            JPanel container = new JPanel(new GridLayout(2, 1));
            container.add(panel);
            container.add(panel2);
            frame.add(container);

            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // program berhenti saat UI di close
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);

        }); 
    }
}
