package MODUL9_GUI;

import java.awt.*;
import javax.swing.*;

public class HasilFramePrak2 extends JFrame {

    public HasilFramePrak2(String nama, String ttl, String no, String telp, String alamat, String email) {

        setTitle("Data Mahasiswa");
        setSize(400, 350);
        setLayout(null);

        JLabel lbJudul = new JLabel("Data Mahasiswa");
        lbJudul.setFont(new Font("Arial", Font.BOLD, 16));
        lbJudul.setBounds(130, 10, 200, 20);
        add(lbJudul);

        JTextArea area = new JTextArea();
        area.setBounds(50, 50, 280, 200);
        area.setEditable(false);

        area.setText(
                "Nama        : " + nama + "\n" +
                "Tanggal Lahir : " + ttl + "\n" +
                "No.Pendaftaran: " + no + "\n" +
                "No.Telp      : " + telp + "\n" +
                "Alamat       : " + alamat + "\n" +
                "E-mail       : " + email
        );

        add(area);
        setVisible(true);
    }
}