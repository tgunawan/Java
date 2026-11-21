package UI;

import javax.swing.*;
import java.awt.*;

public class layout1 {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(()->{
            JFrame frame=new JFrame("Aplikasi Layout 1  Jojo");

            frame.setSize(400,400);

            JPanel panel=new JPanel(new GridLayout(2,2,5,20)); // baris, kolom, gap horisontal, gap vetical
      
            panel.add(new JLabel("Header"));
            panel.add(new JTextArea());
            panel.add(new JButton("Timur"));
            panel.add(new JButton("Simpan"));



            frame.add(panel);

            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // program berhenti saat UI di close
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);

        }); 
    }
}



// frame.setSize(400,400);
// JPanel panel=new JPanel(new FlowLayout());
      
//panel.add(new JLabel("Nama: "));
//panel.add(new JButton("Simpan"));
//panel.add(new JButton("cancel"));


//frame.add(panel);

            // frame.setSize(400,400);
            // JPanel panel=new JPanel(new BorderLayout());
      
            // panel.add(new JLabel("Header"),BorderLayout.NORTH);
            // panel.add(new JTextArea(),BorderLayout.CENTER);
            // panel.add(new JLabel("Timur"),BorderLayout.WEST);
            // panel.add(new JButton("Simpan"),BorderLayout.SOUTH);