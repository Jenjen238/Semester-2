import java.util.Stack;
public class Tes {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<Integer>();
        int desimal = 14;
        while (desimal > 0){
            int repeat = desimal % 2;
            s.push(repeat);
            desimal = desimal / 2;
        }

        while (!s.isEmpty()) { 
            System.out.print(s.pop().toString());
        }
    }
}