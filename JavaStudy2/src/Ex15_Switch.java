import java.util.Scanner;

public class Ex15_Switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int month;

        System.out.println("달을 입력하시오 : ");
        month= sc.nextInt();

        int days =0;
        switch (month) {
            case 1 :
            case 3 :
            case 5 :
            case 7 :
            case 8 :
            case 10:
            case 12: days=31; break;
            case 2 : days=28; break;
            case 4 :
            case 6 :
            case 9 :
            case 11: days=30; break;

        }
        System.out.println(month+"월은"+days+"일 입니다.");

    }
}
