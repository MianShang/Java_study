import java.util.Scanner;

public class home_work_2week {

    public static void main(String[] args) {

        int[] abc = new int[100];
        double sum = 0;
        int cnt = 0;
        double avg;

        Scanner ab = new Scanner(System.in);
        for (int i = 0; i < abc.length; i++) {
            System.out.println("정수를 입력하세요");

            abc[i] = ab.nextInt();
            sum += abc[i];
            cnt++;
            if(abc[i] == 0){
                cnt --;
                break;
            }
        }
        avg = sum / cnt;
        System.out.println("합계는 "+(int)sum+"이고 평균은 "+(int)avg+"입니다.");


    }
}
