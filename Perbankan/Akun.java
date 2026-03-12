package Perbankan;

public class Akun {
    private String nama;        // minimal 4 karakter
    private String password;    // minimal 8 karakter, harus ada underscore, minimal 1 huruf besar
    private int saldo = 0;
    private String nmrRek;      // simpan sebagai String untuk validasi panjang

    public Akun(String nama, String password, int saldo, String nmrRek){
        setNama(nama);
        setPassword(password);
        setSaldo(saldo);
        setNmrRek(nmrRek);
    }

    // ----- getters -----
    public String getNama(){
        return nama;
    }
    public int getSaldo(){
        return saldo;
    }
    public String getNmrRek(){
        return nmrRek;
    }
    public String getPassword(){
        return password;
    }

    // ----- setters dengan validasi -----
    public void setNama(String nama){
        if (nama == null || nama.trim().isEmpty()) {
            System.out.println("Error: Nama tidak boleh kosong.");
            return;
        }
        if (nama.length() < 4){
            System.out.println("Error: Nama harus minimal memiliki 4 karakter.");
            return;
        }
        this.nama = nama;
        System.out.println("Nama berhasil diset: " + this.nama);
    }

    public void setSaldo(int saldo){
        if (saldo < 0) {
            System.out.println("Error: Saldo tidak boleh kurang dari 0.");
            return;
        }
        this.saldo = saldo;
        System.out.println("Saldo berhasil di-set: " + this.saldo);
    }

    public void setNmrRek(String nmrRek){
        if (nmrRek == null || nmrRek.trim().isEmpty()) {
            System.out.println("Error: Nomor rekening tidak boleh kosong.");
            return;
        }
        String digit = nmrRek.trim();
        if (!digit.matches("\\d+")) {
            System.out.println("Error: Nomor rekening harus berupa digit saja.");
            return;
        }
        if (digit.length() < 10) {
            System.out.println("Error: Nomor rekening minimal 10 digit.");
            return;
        }
        this.nmrRek = digit;
        System.out.println("Nomor rekening berhasil diset: " + this.nmrRek);
    }

    public void setPassword(String password){
        if (password == null) {
            System.out.println("Error: Password tidak boleh kosong.");
            return;
        }

        boolean valid = true;
        StringBuilder errorMessage = new StringBuilder();

        // Cek minimal 8 karakter
        if (password.length() < 8) {
            valid = false;
            errorMessage.append("Password harus minimal 8 karakter. ");
        }

        // Cek harus ada underscore
        if (!password.contains("_")) {
            valid = false;
            errorMessage.append("Password harus mengandung underscore (_). ");
        }

        // Cek minimal 1 huruf besar
        boolean adaHurufBesar = false;
        for (int i = 0; i < password.length(); i++) {
            if (Character.isUpperCase(password.charAt(i))) {
                adaHurufBesar = true;
                break;
            }
        }
        if (!adaHurufBesar) {
            valid = false;
            errorMessage.append("Password harus mengandung minimal 1 huruf besar. ");
        }

        if (valid) {
            this.password = password;
            System.out.println("Password berhasil diubah.");
        } else {
            System.out.println("Error pada password: " + errorMessage.toString());
        }
    }

    // ----- helper untuk cek password -----
    private boolean cekPassword(String pw) {
        return this.password != null && this.password.equals(pw);
    }

    // ----- transaksi: deposit & withdraw -----
    /**
     * Menambah saldo. Mengembalikan true jika berhasil.
     */
    public boolean setor(int jumlah, String pw) {
        if (!cekPassword(pw)) {
            System.out.println("Gagal: password salah. Deposit ditolak.");
            return false;
        }
        if (jumlah <= 0) {
            System.out.println("Gagal: jumlah deposit harus lebih dari 0.");
            return false;
        }
        // aman untuk menambah
        this.saldo += jumlah;
        System.out.println("Deposit berhasil: + " + jumlah + ". Saldo sekarang: " + this.saldo);
        return true;
    }

    /**
     * Mengurangi saldo (penarikan). Mengembalikan true jika berhasil.
     */
    public boolean tarik(int jumlah, String pw) {
        if (!cekPassword(pw)) {
            System.out.println("Gagal: password salah. Penarikan ditolak.");
            return false;
        }
        if (jumlah <= 0) {
            System.out.println("Gagal: jumlah penarikan harus lebih dari 0.");
            return false;
        }
        if (jumlah > this.saldo) {
            System.out.println("Gagal: saldo tidak cukup. Saldo saat ini: " + this.saldo);
            return false;
        }
        this.saldo -= jumlah;
        System.out.println("Penarikan berhasil: - " + jumlah + ". Saldo sekarang: " + this.saldo);
        return true;
    }

    
}