package MODUL9_GUI;

import java.awt.event.*;
public class mainFrame2 {
    public static void main (String[] args){
        TFrame2 window = new TFrame2();
        window.setTitle("Hitung Nilai akhir dengan GUI java.awt");
        window.setSize(350,300);
        window.show();
        window.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e){
                System.exit(0);
            }
        });
    }
}
