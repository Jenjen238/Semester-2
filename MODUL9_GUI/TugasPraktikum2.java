package MODUL9_GUI;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class TugasPraktikum2 extends JFrame implements ActionListener {

    JTextField txtNama, txtTTL, txtNoDaftar, txtTelp, txtEmail;
    JTextArea txtAlamat;
    JButton btnSubmit;

    public TugasPraktikum2() {
        setTitle("Form Daftar Ulang Mahasiswa");
        setSize(400, 400);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JLabel lbJudul = new JLabel("Form Data Mahasiswa");
        lbJudul.setFont(new Font("Arial", Font.BOLD, 16));
        lbJudul.setBounds(100, 10, 250, 20);
        add(lbJudul);

        addLabel("Nama Lengkap", 50);
        txtNama = addTextField(50);

        addLabel("Tanggal Lahir", 80);
        txtTTL = addTextField(80);

        addLabel("No. Pendaftaran", 110);
        txtNoDaftar = addTextField(110);

        addLabel("No. Telp", 140);
        txtTelp = addTextField(140);

        addLabel("Alamat", 170);
        txtAlamat = new JTextArea();
        txtAlamat.setBounds(180, 170, 150, 40);
        add(txtAlamat);

        addLabel("E-mail", 220);
        txtEmail = addTextField(220);

        btnSubmit = new JButton("Submit");
        btnSubmit.setBounds(140, 270, 100, 30);
        add(btnSubmit);

        btnSubmit.addActionListener(this);
    }

    private void addLabel(String text, int y) {
        JLabel label = new JLabel(text);
        label.setBounds(40, y, 120, 20);
        add(label);
    }

    private JTextField addTextField(int y) {
        JTextField tf = new JTextField();
        tf.setBounds(180, y, 150, 20);
        add(tf);
        return tf;
    }

    public void actionPerformed(ActionEvent e) {

        // 🔹 VALIDASI
        if (txtNama.getText().isEmpty() ||
            txtTTL.getText().isEmpty() ||
            txtNoDaftar.getText().isEmpty() ||
            txtTelp.getText().isEmpty() ||
            txtAlamat.getText().isEmpty() ||
            txtEmail.getText().isEmpty()) {

            JOptionPane.showMessageDialog(this, "Semua kolom wajib diisi!");
            return;
        }

        // 🔹 KONFIRMASI
        int confirm = JOptionPane.showConfirmDialog(
                this,
                "Apakah anda yakin data sudah benar?",
                "Konfirmasi",
                JOptionPane.OK_CANCEL_OPTION
        );

        if (confirm == JOptionPane.OK_OPTION) {
            new HasilFramePrak2(
                    txtNama.getText(),
                    txtTTL.getText(),
                    txtNoDaftar.getText(),
                    txtTelp.getText(),
                    txtAlamat.getText(),
                    txtEmail.getText()
            );
        }
    }

    public static void main(String[] args) {
        new TugasPraktikum2().setVisible(true);
    }
}
