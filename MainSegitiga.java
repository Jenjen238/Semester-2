public class MainSegitiga {
    public static void main(String[] args) {
        Segitiga ParaKosong = new Segitiga();
        Segitiga ParaIsi = new Segitiga(10, 10, 10, 10);

        //tipe data refrence
        Segitiga A = new Segitiga(10, 10); // A adalah variabel refrence 
        Segitiga B = new Segitiga(6, 10);
        Segitiga C = new Segitiga(8, 10);

        
        B=A; // B mengikuti alamat A jadi mengubah A akan sama nilainya dengan B begitupun sebaliknya
        //ketika alamat B Merefrence ke A maka Segitiga B dianggap sebagai garbage memory
        // stack memory dan heap memory
        B.alas = 20;
        A.alas = 40; //atribut B akan selalu mengikuti A
        System.out.println("Luas Segitiga A : " + A.hitungLuas());
        System.out.println("Luas Segitiga A : " + B.hitungLuas());
        System.out.println("Luas Segitiga A : " + C.hitungLuas());
        System.out.println(A.nama); // null itu tidak merefrence kemanapun
        
        //tipe data primitif dia menyimpan nilai
        int x = 10;
        int y = 20;
        int z = 30;

        x=y;
        y=50;
        
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
       
    }
}
