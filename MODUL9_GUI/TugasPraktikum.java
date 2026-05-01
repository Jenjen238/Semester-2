package MODUL9_GUI;

import java.awt.*;
import java.awt.event.*;
import java.util.LinkedHashMap;
import java.util.Map;

public class TugasPraktikum extends Frame implements ActionListener, ItemListener {

    Label lbJudul, lbTugas, lbKuis, lbUTS, lbUAS, lbHasil;
    TextField txtTugas, txtKuis, txtUTS, txtUAS, txtHasil;
    CheckboxGroup cbg;
    Checkbox cbASD, cbPemlan, cbMatkomlan, cbProbstat;
    Button btnHitung, btnTampilSemua;
    TextArea taHasil;

    Pemlan pemlan = new Pemlan();
    ASD asd = new ASD();
    Matkomlan matkomlan = new Matkomlan();
    Probstat probstat = new Probstat();

    Map<String, Double> hasilSimpan = new LinkedHashMap<>();

    public TugasPraktikum() {
        setLayout(null);

        lbJudul = new Label("Hitung Nilai Akhir");
        lbJudul.setFont(new Font("Arial", Font.BOLD, 14));
        add(lbJudul);
        lbJudul.setBounds(150, 20, 170, 20);

        cbg = new CheckboxGroup();

        cbASD = new Checkbox("ASD", cbg, false);
        cbPemlan = new Checkbox("Pemlan", cbg, true);
        cbMatkomlan = new Checkbox("Matkomlan", cbg, false);
        cbProbstat = new Checkbox("Probstat", cbg, false);

        add(cbASD); add(cbPemlan); add(cbMatkomlan); add(cbProbstat);

        cbASD.setBounds(20, 55, 60, 20);
        cbPemlan.setBounds(100, 55, 80, 20);
        cbMatkomlan.setBounds(200, 55, 100, 20);
        cbProbstat.setBounds(315, 55, 90, 20);

        cbASD.addItemListener(this);
        cbPemlan.addItemListener(this);
        cbMatkomlan.addItemListener(this);
        cbProbstat.addItemListener(this);

        lbTugas = new Label("Tugas : ");
        lbKuis = new Label("Kuis : ");
        lbUTS = new Label("UTS : ");
        lbUAS = new Label("UAS : ");
        lbHasil = new Label("Hasil : ");

        add(lbTugas); add(lbKuis); add(lbUTS); add(lbUAS); add(lbHasil);

        lbTugas.setBounds(120, 95, 60, 20);
        lbKuis.setBounds(120, 125, 60, 20);
        lbUTS.setBounds(120, 155, 60, 20);
        lbUAS.setBounds(120, 185, 60, 20);
        lbHasil.setBounds(120, 215, 60, 20);

        txtTugas = new TextField("");
        txtKuis = new TextField("");
        txtUTS = new TextField("");
        txtUAS = new TextField("");
        txtHasil = new TextField("");

        add(txtTugas); add(txtKuis); add(txtUTS); add(txtUAS); add(txtHasil);

        txtTugas.setBounds(210, 95, 70, 20);
        txtKuis.setBounds(210, 125, 70, 20);
        txtUTS.setBounds(210, 155, 70, 20);
        txtUAS.setBounds(210, 185, 70, 20);
        txtHasil.setBounds(210, 215, 70, 20);

        btnHitung = new Button("Hitung");
        add(btnHitung);
        btnHitung.setBounds(165, 250, 120, 25);
        btnHitung.addActionListener(this);

        taHasil = new TextArea("", 8, 30, TextArea.SCROLLBARS_BOTH);
        add(taHasil);
        taHasil.setBounds(70, 285, 320, 120);
        taHasil.setEditable(false);

        btnTampilSemua = new Button("Tampilkan nilai semua matkul");
        add(btnTampilSemua);
        btnTampilSemua.setBounds(80, 420, 300, 25);
        btnTampilSemua.addActionListener(this);
    }

    public void itemStateChanged(ItemEvent e) {
        if (e.getStateChange() == ItemEvent.SELECTED) {
            txtTugas.setText("");
            txtKuis.setText("");
            txtUTS.setText("");
            txtUAS.setText("");
            txtHasil.setText("");
        }
    }

    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();

        if (source == btnHitung) {
            try {
                double tugas = Double.parseDouble(txtTugas.getText().trim());
                double kuis  = Double.parseDouble(txtKuis.getText().trim());
                double uts   = Double.parseDouble(txtUTS.getText().trim());
                double uas   = Double.parseDouble(txtUAS.getText().trim());

                Checkbox selected = cbg.getSelectedCheckbox();
                String matkul = selected.getLabel();

                double hasil = 0;

                if (matkul.equals("Pemlan")) {
                    hasil = pemlan.hitungNilai(tugas, kuis, uts, uas);
                } else if (matkul.equals("ASD")) {
                    hasil = asd.hitungNilai(tugas, kuis, uts, uas);
                } else if (matkul.equals("Matkomlan")) {
                    hasil = matkomlan.hitungNilai(tugas, kuis, uts, uas);
                } else if (matkul.equals("Probstat")) {
                    hasil = probstat.hitungNilai(tugas, kuis, uts, uas);
                }

                txtHasil.setText(String.valueOf(hasil));
                hasilSimpan.put(matkul, hasil);
                tampilkanSemua();

            } catch (Exception ex) {
                txtHasil.setText("Input salah");
            }
        }

        if (source == btnTampilSemua) {
            tampilkanSemua();
        }
    }

    private void tampilkanSemua() {
        StringBuilder sb = new StringBuilder();
        sb.append("HASIL NILAI SEMUA MATA KULIAH\n\n");

        for (Map.Entry<String, Double> data : hasilSimpan.entrySet()) {
            sb.append(data.getKey())
            .append(" : ")
            .append(data.getValue())
            .append("\n");
        }

        taHasil.setText(sb.toString());
    }
}

// ================= CLASS MATA KULIAH ================= 

class Pemlan {
    public double hitungNilai(double t, double k, double uts, double uas) {
        return (0.25*t) + (0.25*k) + (0.25*uts) + (0.25*uas);
    }
}

class ASD {
    public double hitungNilai(double t, double k, double uts, double uas) {
        return (0.30*t) + (0.20*k) + (0.25*uts) + (0.25*uas);
    }
}

class Matkomlan {
    public double hitungNilai(double t, double k, double uts, double uas) {
        return (0.20*t) + (0.20*k) + (0.30*uts) + (0.30*uas);
    }
}

class Probstat {
    public double hitungNilai(double t, double k, double uts, double uas) {
        return (0.10*t) + (0.20*k) + (0.30*uts) + (0.40*uas);
    }
}

class Main {
    public static void main(String[] args) {
        TugasPraktikum window = new TugasPraktikum();
        window.setTitle("Hitung Nilai Akhir dengan GUI java.awt");
        window.setSize(460, 500);
        window.setVisible(true);

        window.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
}