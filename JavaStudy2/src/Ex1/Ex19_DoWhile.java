package Ex1;

import java.util.Scanner;

public class Ex19_DoWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ck;

        do {
            System.out.println("다시할까요(Y/y: ");
            ck = sc.next().charAt(0);
        }while (ck == 'Y' || ck == 'y');
        System.out.println("** 수고하셨습니다 **");
    }

}
