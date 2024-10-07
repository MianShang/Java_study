package Intf;
import java.util.Scanner;


public class Code167
{
    public static void main(String[] args) {
        Scanner scin = new Scanner(System.in);

        System.out.println("Enter number between 0 ~ 100");
        int num = scin.nextInt();

        if(num < Limit.MIN || num > Limit.MAX)
            System.out.println("Out of range");
        else
            System.out.println("Good");

    }
}
