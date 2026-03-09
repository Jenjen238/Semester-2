public class MainBuku {
    public static void main(String[] args) {
        BukuTulis Asep = new BukuTulis();
        Asep.setJumlahLembar(50);
        Asep.setKataPerHari(100);
        Asep.setHalamanPerHari(0.5);
        Asep.displayMessage();
    }
}
