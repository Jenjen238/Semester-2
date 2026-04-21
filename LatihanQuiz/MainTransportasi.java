package LatihanQuiz;

public class MainTransportasi {
    public static void main(String[] args) {
        System.out.println("=== Sistem Pembayaran Transportasi Online ===\n");

        Transportasi mobil = new Mobil("GoCar", 5000);
        Transportasi motor = new Motor("GoRide", 3000);//UpCasting

        try {
            // Test Mobil
            System.out.println(mobil);
            double biayaMobil = mobil.hitungBiaya(10);
            System.out.printf("Biaya perjalanan 10.0 km: Rp%.2f\n", biayaMobil);

            // Test Diskon (perlu casting ke Diskonable)
            //Downcasting
            if (mobil instanceof Diskonable) {
                Diskonable d = (Diskonable) mobil;
                double diskon = d.hitungDiskon(biayaMobil);
                System.out.printf("Diskon 10%%: Rp%.2f\n", diskon);
                System.out.printf("Total setelah diskon: Rp%.2f\n", biayaMobil - diskon);
            }

            System.out.println();

            // Test Motor
            System.out.println(motor);
            double biayaMotor = motor.hitungBiaya(8);
            System.out.printf("Biaya perjalanan 8.0 km: Rp%.2f\n", biayaMotor);

        } catch (JarakException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // Test Exception dengan jarak negatif
        System.out.println("\n--- Test Exception ---");
        try {
            motor.hitungBiaya(-5);
        } catch (JarakException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("Program Closed");
        }
    }
}
