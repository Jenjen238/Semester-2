package Perbankan;
public class Akun {
    private String nama;//minimal 4 karakter
    private String password;// minimal 8 karakter harus ada underscore, minimal 1 huruf besar
    private int saldo = 0;
    private int nmrRek;//Minimal 10 karakter
    //tiap transaksi harus memasukkan password

    public Akun (String nama, String password,int saldo, int nmrRek){
        this.nama = nama;
        this.password = password;
        this.saldo = saldo;
        this.nmrRek = nmrRek;
    }

    public String getNama(){
        return nama;
    }
    public int getSaldo(){
        return saldo;
    }
    public int getnmrRek(){
        return nmrRek;
    }
    public String getPassword(){
        return password;
    }

    public void setNama(String nama){
        if (nama.length() < 4){
            System.out.println("Nama harus minimal memiliki 4 Karakter");
        }
    }
    public void setSaldo(int saldo){
        if (saldo <= 0){
            System.out.println("Saldo tidak boleh kurang dari 0");
        }
    }
    public void setnmrRek(int nmrRek){
        int panjang =  String.valueOf(nmrRek).length();
        if (panjang < 10){
            System.out.println("Error, Nomor Rekening Minimal 10 Digit");
        }
    }
    public void setPassword(String password){
        boolean valid = true;
        String errorMessage = "";
        
        // Cek minimal 8 karakter
        if (password.length() < 8) {
            valid = false;
            errorMessage += "Password harus minimal 8 karakter, ";
        }
        
        // Cek harus ada underscore
        if (!password.contains("_")) {
            valid = false;
            errorMessage += "Password harus mengandung underscore (_), ";
        }
        
        // Cek minimal 1 huruf besar
        boolean adaHurufBesar = false;
        for (int i = 0; i < password.length(); i++) {
            if (java.lang.Character.isUpperCase(password.charAt(i))) {
                adaHurufBesar = true;
                break;
            }
        }
        if (!adaHurufBesar) {
            valid = false;
            errorMessage += "Password harus mengandung minimal 1 huruf besar";
        }
        
        if (valid) {
            this.password = password;
            System.out.println("Password berhasil diubah");
        } else {
            System.out.println("Error: " + errorMessage);
        }
    }
    public void tambahSaldo(){
        int tambahSaldo = 0;
        System.out.println("Masukkan Password : ");
        
    }
}
