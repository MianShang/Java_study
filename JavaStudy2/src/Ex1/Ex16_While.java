package Ex1;

public class Ex16_While {
    public static void main(String[] args) {
        int n= 0;
        while (true){
            n++;
            if(n <= 5){
                System.out.println("Hello World");
            }
            else{
                break;
            }
        }

        n = 0;
        while (n<5){
            ++n;
            System.out.println("Hello World");
        }



    }
}
