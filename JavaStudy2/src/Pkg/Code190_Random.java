package Pkg;

import java.util.Random;

public class Code190_Random {
    public static void main(String[] args) {
        Random rand1 = new Random();
        Random rand2 = new Random();

        for(int i = 0; i < 6; i++){
            System.out.print(rand1.nextInt(45)+" ");
        }
    }
}
