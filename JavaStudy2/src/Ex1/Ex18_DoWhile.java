package Ex1;

import java.util.Scanner;

public class Ex18_DoWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;

        do {
            System.out.println("점수를 입력하세요");
            num=sc.nextInt();
        }while (num<0 || num>100);

        System.out.println("당신의 점수는 "+num+"점 입니다.");
    }
}
