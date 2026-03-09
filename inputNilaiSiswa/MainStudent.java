package inputNilaiSiswa;
import java.util.Scanner;
public class MainStudent {
public static void main(String[] args) { 
    Scanner input = new Scanner (System.in);
    int jumlahSiswa = 0;
                // Student anna = new Student(); 
                    // anna.setName("Anna"); 
                    // anna.setAddress("Malang"); 
                    // anna.setAge(20); 
                    // anna.setMath(100); 
                    // anna.setScience(89); 
                    // anna.setEnglish(80); 
                    // anna.displayMessage(); 
                    //menggunakan constructor lain 
                    // System.out.println("==================="); 
                Student chris = new Student("Chris", "Kediri", 21); 
                chris.setMath(70); 
                chris.setScience(60); 
                chris.setEnglish(90); 
                chris.displayMessage();
                //siswa dengan nama anna dirubah informasi alamat danumurnya melalui constructor 
                // System.out.println("==================="); 
                // anna = new Student("anna", "Batu", 18); 
                // anna.displayMessage(); 
                //siswa denagan nama chris dirubah informasi alamat dan umurnya melalui method 
                // System.out.println("==================="); 
                // chris.setAddress(); 
                // chris.setAge(22); 
                // chris.displayMessage(); 
                // System.out.println("==================="); 
                // Student jenjen = new Student(10, 40,50);
                // jenjen.displayMessage();
                System.out.println("==================="); 
                System.out.print("Masukkan jumlah siswa : ");
                jumlahSiswa = input.nextInt();
                input.nextLine();

                Student [] siswa = new Student[jumlahSiswa];

                for (int i = 0; i < jumlahSiswa; i++) {
                    System.err.println("Siswa/Siswi ke : " + (i+1));
                    siswa [i] = new Student();

                    System.out.print("Nama Siswa/Siswi : ");
                    siswa [i].setName(input.nextLine());

                    System.out.print("Alamat Siswa/Siswi : ");
                    siswa [i].setAddress(input.nextLine());

                    System.out.print("Umur Siswa/Siswi : ");
                    siswa [i].setAge(input.nextInt());

                    System.out.print("Math Score : ");
                    siswa [i].setMath(input.nextInt());

                    System.out.print("English Score : ");
                    siswa [i].setEnglish(input.nextInt());

                    System.out.print("Science Score: ");
                    siswa [i].setScience(input.nextInt());
                    input.nextLine();
                    Student.jumlahObjek();
                    siswa[i].displayMessage();
                }

                



    } 
}

