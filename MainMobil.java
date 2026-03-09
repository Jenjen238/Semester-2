import java.util.Scanner;
public class MainMobil {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        //instan objek bernama m1
        Mobil m1 = new Mobil();
        System.out.print("Masukkan Kecepatan Mobil 1 : ");
        m1.setKecepatan(input.nextInt());
        input.nextLine();

        System.out.print("Masukkan Manufaktur Mobil 1 : ");
        m1.setManufaktur(input.nextLine());

        System.out.print("Masukkan NoPlat Mobil 1 : ");
        m1.setNoPlat(input.nextLine());

        System.out.print("Masukkan Warna Mobil 1 : ");
        m1.setWarna(input.nextLine());

        System.out.print("Masukkan Waktu : ");
        m1.setWaktu(input.nextDouble());
        m1.displayMessage();

        // System.out.println("================");
        //instan objek bernama m1
        // Mobil m1 = new Mobil();

        // m1.setKecepatan(50);
        // m1.setManufaktur("Toyota");
        // m1.setNoPlat("AB 1231 UA");
        // m1.setWarna("Merah");
        // m1.displayMessage();

        // System.out.println("================");


        // //instan objek baru bernama m2
        // Mobil m2 = new Mobil();

        // m2.setKecepatan(100);
        // m2.setManufaktur("Mitsubishi");
        // m2.setNoPlat("N 1134 AG");
        // m2.setWarna("Pink");
        // m2.displayMessage();

        // System.out.println("================");

        // //merubah warna dari objek m1
        // System.out.println("mobil pada objek m1 di rubah menjadi warna hijau");
        // m1.setWarna("Hijau");
        
        // //menampilkan hasil perubahan
        // m1.displayMessage();
    }
}