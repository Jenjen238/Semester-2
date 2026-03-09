package inputNilaiSiswa;
public class Student {
private String name; 
private String address; 
private int age; 
private double mathGrade; 
private double englishGrade; 
private double scienceGrade; 
private static int count;
        public Student(){ 
            name = ""; 
            address = ""; 
            age = 0; 
            count++;
        } 
        public Student (int math, int english, int science){
            System.out.println("Math : " + math);
            System.out.println("English : " + english);
            System.out.println("Science : " + science );
            count++;
        }
        public Student(String n, String a, int ag){ 
            name = n; 
            address = a; 
            age = ag; 
            count++;
        } 
        public void setName(String n){
            name = n;
        } 
            public void setAddress(String a){ 
            address = a; 
            } 
            public void setAge(int ag){ 
            age = ag; 
            } 
            public void setMath(int math){ 
            mathGrade = math; 
            } 
            public void setEnglish(int english){ 
            englishGrade = english; 
            } 
            public void setScience(int science){ 
            scienceGrade = science; 
            } 
            private double getAverage(){ 
            double result = 0; 
            result = (mathGrade+scienceGrade+englishGrade)/3; 
            return result; 
            } 
            public boolean statusAkhir(){
                boolean hasil;
                if (getAverage()>= 61){
                    hasil = true;
                    System.out.println("Anda Lulus");
                } else {
                    hasil = false;
                    System.out.println("Maaf anda remedial");
                }
                return hasil;
            }
            public static void jumlahObjek(){
                System.out.println("Jumlah Objek yang telah dibuat : " + count);
            }



public void displayMessage(){ 
System.out.println("Siswa dengan nama : "+name); 
System.out.println("Beralamat di : "+address); 
System.out.println("berumur : "+age); 
System.out.println("mempunyai nilai rata rata : "+getAverage()); 
System.out.println("Status akhir :  " + statusAkhir()); 
}
}