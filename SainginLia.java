import java.util.Scanner;
public class SainginLia {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean bisa = true;
        int password = 1234567;
        int inpas = input.nextInt();
        if(password == inpas){
            System.out.println(bisa);
        }
    }
}