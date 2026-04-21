package MODUL8_Interface;

public class Invoice implements Payable {
    String namaProduk;
    Integer jumlah;
    Integer hargaSatuan;

    public Invoice(String namaProduk, Integer jumlah, Integer hargaSatuan) {
        this.namaProduk = namaProduk;
        this.jumlah = jumlah;
        this.hargaSatuan = hargaSatuan;
    }

    @Override
    public int getPayableAmount() {
        return jumlah * hargaSatuan;
    }

    public void tampilkanInvoice() {
        System.out.println("  - " + namaProduk + " | " + jumlah + " x Rp" + hargaSatuan + " = Rp" + getPayableAmount());
    }
}