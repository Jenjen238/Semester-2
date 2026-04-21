package LatihanQuiz;

public class GenericClass <T>{
    private T Apapun;

    public void setApapun(T Apapun){
        this.Apapun = Apapun;
    }
    public T getApapun(){
        return Apapun;
    }
}

class Main {
    public static void main(String[] args) {
        GenericClass<String> Kotak = new GenericClass<>();
        Kotak.setApapun("Hello");
        String contect = Kotak.getApapun();
        System.out.println(contect);
    }
}