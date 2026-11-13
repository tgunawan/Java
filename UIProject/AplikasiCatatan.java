package UIProject;

import javax.swing.*;
import java.awt.*;

public class AplikasiCatatan {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Aplikasi Catatan Sederhana");
            frame.setSize(450, 450);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setLocationRelativeTo(null);
            frame.setLayout(new BorderLayout(10, 10)); // Layout utama dengan jarak 10px

            // --- BAGIAN ATAS (Input Judul & Checkbox) ---
            JPanel panelAtas = new JPanel(new FlowLayout(FlowLayout.LEFT));
            JLabel lblJudul = new JLabel("Judul:");
            JTextField inputJudul = new JTextField(20);
            JCheckBox checkPenting = new JCheckBox("Tandai Penting");

            panelAtas.add(lblJudul);
            panelAtas.add(inputJudul);
            panelAtas.add(checkPenting);

            // --- BAGIAN TENGAH (Area Isi Catatan) ---
            JTextArea areaCatatan = new JTextArea();
            areaCatatan.setLineWrap(true);       // Teks otomatis turun baris jika penuh
            areaCatatan.setWrapStyleWord(true);  // Pemotongan kata rapi (tidak terpotong di tengah kata)
            JScrollPane scrollPane = new JScrollPane(areaCatatan);
            scrollPane.setBorder(BorderFactory.createTitledBorder("Isi Catatan"));

            // --- BAGIAN BAWAH (Tombol Aksi) ---
            JPanel panelBawah = new JPanel();
            JButton btnSimpan = new JButton("Simpan Catatan");
            JButton btnReset = new JButton("Hapus / Reset");

            panelBawah.add(btnSimpan);
            panelBawah.add(btnReset);

            // --- EVENT HANDLING ---
            btnSimpan.addActionListener(e -> {
                String judul = inputJudul.getText().trim();
                String isi = areaCatatan.getText().trim();
                boolean isPenting = checkPenting.isSelected();

                // Validasi input kosong
                if (judul.isEmpty() || isi.isEmpty()) {
                    JOptionPane.showMessageDialog(frame, 
                        "Judul dan Isi Catatan tidak boleh kosong!", 
                        "Peringatan", 
                        JOptionPane.WARNING_MESSAGE);
                    return;
                }

                // Format pesan hasil
                String status = isPenting ? "[PENTING] " : "[Biasa] ";
                String ringkasan = status + judul + "\n\n" + isi;

                JOptionPane.showMessageDialog(frame, 
                    ringkasan, 
                    "Catatan Tersimpan", 
                    JOptionPane.INFORMATION_MESSAGE);
            });

            btnReset.addActionListener(e -> {
                int konfirmasi = JOptionPane.showConfirmDialog(frame, 
                    "Yakin ingin menghapus semua teks?", 
                    "Konfirmasi Reset", 
                    JOptionPane.YES_NO_OPTION);

                if (konfirmasi == JOptionPane.YES_OPTION) {
                    inputJudul.setText("");
                    areaCatatan.setText("");
                    checkPenting.setSelected(false);
                }
            });

            // Masukkan semua panel ke Frame
            frame.add(panelAtas, BorderLayout.NORTH);
            frame.add(scrollPane, BorderLayout.CENTER);
            frame.add(panelBawah, BorderLayout.SOUTH);

            frame.setVisible(true);
        });
    }
}