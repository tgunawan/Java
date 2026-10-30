package UI;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class contoh1 extends JFrame {
    public contoh1() {
        JButton btn = new JButton("Klik Saya");
        btn.addActionListener(e -> System.out.println("Hello Swing!"));

        add(btn);
        setTitle("Contoh Java Swing");
        setSize(300, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            contoh1 window = new contoh1();
            window.setVisible(true);
        });
    }
}
