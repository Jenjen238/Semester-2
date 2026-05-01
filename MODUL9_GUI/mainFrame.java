package MODUL9_GUI;

import java.awt.event.*;
public class mainFrame {
    public static void main(String[] args) {
        TFrame window = new TFrame();
        window.setTitle("Hitung Nilai Akhir dengan GUI java.awt");
        window.setSize(350,300);
        window.show();
        window.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e){
                System.exit(0);
            }
        });
    }
}
