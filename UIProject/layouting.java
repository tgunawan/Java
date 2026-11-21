package UIProject;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.SwingUtilities;

public class layouting {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Model Layout Swing");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(800, 600);
            frame.setLocationRelativeTo(null);

            // Panel utama dengan jarak pinggir (padding)
            JPanel mainPanel = new JPanel(new BorderLayout(12, 12));
            mainPanel.setBorder(BorderFactory.createEmptyBorder(12, 12, 12, 12));

            // --- PANEL KIRI (4 item berjejer ke bawah) ---
            JPanel leftPanel = new JPanel();
            leftPanel.setLayout(new BoxLayout(leftPanel, BoxLayout.Y_AXIS));
            leftPanel.setPreferredSize(new Dimension(210, 0));
            leftPanel.setBorder(BorderFactory.createTitledBorder("Menu Kiri"));

            JButton btn1 = new JButton("Tombol 1");
            JButton btn2 = new JButton("Tombol 2");
            JLabel lblMenu = new JLabel("Tes Label Menu", JLabel.CENTER);
            JButton btn3 = new JButton("Tombol 3");

            // Samakan lebar maksimum agar memenuhi panel kiri
            Dimension itemMaxSize = new Dimension(Integer.MAX_VALUE, 42);
            for (Component comp : new Component[]{btn1, btn2, lblMenu, btn3}) {
                if (comp instanceof JButton) {
                    ((JButton) comp).setMaximumSize(itemMaxSize);
                } else if (comp instanceof JLabel) {
                    comp.setMaximumSize(itemMaxSize);
                }
                leftPanel.add(comp);
                leftPanel.add(Box.createVerticalStrut(10));
            }

            // --- PANEL KANAN (2 kotak besar atas & bawah) ---
            JPanel rightPanel = new JPanel(new GridLayout(2, 1, 0, 12));

            // Kotak Kanan Atas: Tes JTextArea + JLabel
            JPanel topRightPanel = new JPanel(new BorderLayout(6, 6));
            topRightPanel.setBorder(BorderFactory.createTitledBorder("Area Atas"));
            JLabel topLabel = new JLabel("Tes Label - Input Catatan:");
            JTextArea topTextArea = new JTextArea();
            topTextArea.setLineWrap(true);
            topTextArea.setWrapStyleWord(true);
            topRightPanel.add(topLabel, BorderLayout.NORTH);
            topRightPanel.add(new JScrollPane(topTextArea), BorderLayout.CENTER);

            // Kotak Kanan Bawah: Tes JTextArea + JButton
            JPanel bottomRightPanel = new JPanel(new BorderLayout(6, 6));
            bottomRightPanel.setBorder(BorderFactory.createTitledBorder("Area Bawah"));
            JTextArea bottomTextArea = new JTextArea();
            bottomTextArea.setLineWrap(true);
            bottomTextArea.setWrapStyleWord(true);
            JButton actionButton = new JButton("Proses / Tes Tombol");

            // Aksi sederhana untuk menguji komponen
            actionButton.addActionListener(e -> {
                topLabel.setText("Label Terupdate: " + bottomTextArea.getText().trim());
            });

            bottomRightPanel.add(new JScrollPane(bottomTextArea), BorderLayout.CENTER);
            bottomRightPanel.add(actionButton, BorderLayout.SOUTH);

            rightPanel.add(topRightPanel);
            rightPanel.add(bottomRightPanel);

            // Gabungkan panel kiri dan kanan
            mainPanel.add(leftPanel, BorderLayout.WEST);
            mainPanel.add(rightPanel, BorderLayout.CENTER);

            frame.add(mainPanel);
            frame.setVisible(true);
        });
    }
}