package UI;

import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;

public class contoh1 extends JFrame {
    public contoh1(int n) {
        JButton btn = new JButton("Klik Saya");
        btn.setBorder(BorderFactory.createLineBorder(Color.blue));

        btn.addActionListener(e -> System.out.println("Hello Swing! " + n));
        add(btn);

        setTitle("Contoh Java Swing");
        setSize(300, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        int i = 1;
        SwingUtilities.invokeLater(() -> {
            contoh1 window = new contoh1(i);
            window.setVisible(true);
        });
    }
}
