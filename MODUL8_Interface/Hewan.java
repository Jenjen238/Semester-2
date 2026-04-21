package MODUL8_Interface;

import java.util.Scanner;

public class Hewan implements MakhlukHidup, Identitas {
    private String nama;
    private int umur;
    private String jenis;
    public Hewan(String nama, int umur, String jenis) {
        this.nama = nama;
        this.umur = umur;
        this.jenis = jenis;
    }
    @Override
    public void makan(){
        System.out.println("Makan pakai tangan mulut");
    }
    @Override
    public void berjalan(){
        System.out.println("Jalan pakai 4 kaki");
    }
    @Override
    public void bersuara(){
        System.out.println("Suaranya engga jelas");
    }
    @Override
    public void tampilkanNama(){
        System.out.println("Nama hewan : " + this.nama);
    }
    @Override
    public void tampilkanUmur(){
        System.out.println("Umur hewan : " + this.umur);
    }
    public void tampilkanJenis() {
        System.out.println("Jenis hewan : " + this.jenis);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nama hewan : ");
        String nama = input.nextLine();

        System.out.print("Masukkan umur hewan : ");
        int umur = input.nextInt();
        input.nextLine();

        System.out.print("Masukkan jenis hewan : ");
        String jenis = input.nextLine();

        Hewan h = new Hewan(nama, umur, jenis);
        h.tampilkanNama();
        h.tampilkanUmur();
        h.tampilkanJenis();
        h.makan();
        h.berjalan();
        h.bersuara();
    }
}
