package MODUL8_Interface;

public class Employee implements Payable {
    Integer nomorRegistrasi;
    String nama;
    Integer gajiPerBulan;
    Invoice[] invoices;

    public Employee(Integer nomorRegistrasi, String nama, Integer gajiPerBulan, Invoice[] invoices) {
        this.nomorRegistrasi = nomorRegistrasi;
        this.nama = nama;
        this.gajiPerBulan = gajiPerBulan;
        this.invoices = invoices;
    }

    @Override
    public int getPayableAmount() {
        int totalBelanja = 0;
        for (Invoice inv : invoices) {
            totalBelanja += inv.getPayableAmount();
        }
        return gajiPerBulan - totalBelanja;
    }

    public void tampilkanInfo() {
        System.out.println("Nomor Registrasi : " + nomorRegistrasi);
        System.out.println("Nama             : " + nama);
        System.out.println("Gaji Per Bulan   : Rp" + gajiPerBulan);

        System.out.println("Detail Belanja   :");
        int totalBelanja = 0;
        for (Invoice inv : invoices) {
            inv.tampilkanInvoice();
            totalBelanja += inv.getPayableAmount();
        }

        System.out.println("Total Belanja    : Rp" + totalBelanja);
        System.out.println("Gaji Diterima    : Rp" + getPayableAmount());
    }

    public static void main(String[] args) {
        Invoice[] invoices = {
            new Invoice("Beras 5kg", 2, 65000),
            new Invoice("Minyak Goreng", 3, 20000),
            new Invoice("Sabun Mandi", 5, 8000)
        };

        Employee karyawan = new Employee(1001, "Hanif", 5000000, invoices);

        System.out.println("===== INFORMASI KARYAWAN =====");
        karyawan.tampilkanInfo();
    }
}