package UI;

import javax.swing.*;
import java.awt.*;


public class contohEvent1 {


    public static void main(String[] args) {
        SwingUtilities.invokeLater(()->{
            JFrame frame=new JFrame("Event Handling Example");
            
            JTextField inputName=new JTextField(15); //input text 1 baris
            JButton tombol = new JButton("Sapaan");
            JLabel hasil=new JLabel(" ");
            
            tombol.addActionListener(event -> {
                String nama = inputName.getText();
                if (nama.isBlank()){
                    hasil.setText("Nama masih kosong seilahkan isi dahulu. ");
                    JOptionPane.showMessageDialog(frame,"Isi dahulu","Error",JOptionPane.ERROR_MESSAGE);
                }else{
                    hasil.setText("Selamat datang "+ nama+"!");
                    JOptionPane.showMessageDialog(frame,"Terimakasih","Informasi",JOptionPane.INFORMATION_MESSAGE);
                }
            });

            JPanel panel = new JPanel();
            panel.add(new JLabel("Nama: "));
            panel.add(inputName);
            panel.add(tombol);
            panel.add(hasil);

            frame.add(panel);

            int pilihan= JOptionPane.showConfirmDialog(frame,"Apakah sudah selesai?","Konfirmasi",JOptionPane.YES_NO_OPTION);
            if (pilihan==JOptionPane.YES_OPTION){
                System.out.println("Terkonfirm");
            }


            frame.setSize(500,150);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // program berhenti saat UI di close
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
        });
    }
}
