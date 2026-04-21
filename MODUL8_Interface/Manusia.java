package MODUL8_Interface;
import java.util.Scanner;
public class Manusia implements Identitas, MakhlukHidup  {
    private String nama;
    private int umur;

    public Manusia (String nama, int umur){
        this.nama = nama;
        this.umur = umur;
    }
    @Override
    public void makan(){
        System.out.println("Makan pakai sendok dan garpu");
    }
    @Override
    public void berjalan(){
        System.out.println("Jalan pakai kaki");
    }
    @Override
    public void bersuara(){
        System.out.println("Ngengo");
    }
    
    public void tampilkanNama(){
        System.out.println("Nama saya : " + this.nama);
    }
    @Override
    public void tampilkanUmur(){
        System.out.println("Umur saya : " + this.umur);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Nama : ");
        String nama = input.nextLine();
        System.out.print("Masukkan umur : ");
        int umur = input.nextInt();
        Manusia m = new Manusia(nama, umur);
        m.tampilkanNama();
        m.tampilkanUmur();
        m.makan();
        m.berjalan();
        m.bersuara();
    }
}
