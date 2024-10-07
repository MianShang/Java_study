import java.util.Scanner;
public class home_work_3week {

    public static void main(String[] args) {
        int a =0,b =0,sum =0;

        Scanner s = new Scanner(System.in);

        System.out.print("숫자 입력 : ");
        a = s.nextInt();
        System.out.print("숫자 입력 : ");
        b = s.nextInt();


        System.out.print("결과 : ");
        if (a>b){
            for (int i = b; i <= a; i++){
                sum += i;
                System.out.print(" "+i+" ");
            }
            System.out.println("\n합계 : "+ sum);
        }
        else {
            for (int i = a; i <= b; i++){
                sum += i;
                System.out.print(" "+i+" ");
            }
            System.out.println("\n합계 : "+ sum);
        }

    }

}
