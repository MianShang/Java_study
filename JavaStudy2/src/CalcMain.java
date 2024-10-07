import java.util.Scanner;
import java.lang.String;

public class CalcMain {
    public static void main(String[] args) {

        int a;
        int b;
        String c;

        Scanner s = new Scanner(System.in);

        System.out.println("계산할 숫자 하나를 입력하세요(정수만 입력)");
        a = s.nextInt();
        System.out.println("계산할 숫자 하나를 입력하세요(정수만 입력)");
        b = s.nextInt();
        System.out.println("+, -, *, / 중 하나를 입력해 주세요");
        c = s.next();;

        Calculator d = new Calculator(a,b,c);


        if(c.equals("/")) {
            System.out.println(a +" "+ c +" "+ b + "의 계산 결과는" + d.getSum() + "입니다.");
        }
        else {
            System.out.println(a +" "+c+" " + b + "의 계산 결과는" + d.getSum2() + "입니다.");
        }


    }
}
