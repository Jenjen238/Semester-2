package MODUL6_Inheritance;

import java.time.LocalDate;

public class TestCaseModul6 {
    public static void main(String[] args) {
        Manusia A = new Manusia("Farel", true, "73111777444", true);
        Manusia B = new Manusia("Brian", false, "73111777444", true);
        Manusia C = new Manusia("Jason", true, "73111777444", false);

        ManusiaFILKOM AFilkom = new ManusiaFILKOM("Jangwonyoung", false, "73711080700", false, "255150707111058", 2.5);
        ManusiaFILKOM BFilkom = new ManusiaFILKOM("Haerin", false, "737110807", false, "255150707111059", 3.28);
        ManusiaFILKOM CFilkom = new ManusiaFILKOM("Afghani", true, "7371108070004", false, "255150707111060", 3.68);
        
        Pekerja Lama1 = new Pekerja("Mas Fuad", true, "12345678910", true, 200, LocalDate.of(2024, 1, 1), 2);
        Pekerja Lama2 = new Pekerja("Mas Resky", true, "12345678911", false, 200, LocalDate.of(2017, 1, 1), 0);
        Pekerja Lama3 = new Pekerja("Mas Habibie", true, "12345678912", true, 200, LocalDate.of(2006, 1, 1), 10);

        Manager TheOneAndOnly = new Manager("Hanif", true, "7371108070004", true, 7500, LocalDate.of(2011, 1, 1), 2, "BackEnd Developer");

        System.out.println(A);
        System.out.println(B);
        System.out.println(C);
        System.out.println(AFilkom);
        System.out.println(BFilkom);
        System.out.println(CFilkom);
        System.out.println(Lama1);
        System.out.println(Lama2);
        System.out.println(Lama3);
        System.out.println(TheOneAndOnly);
    }
}
