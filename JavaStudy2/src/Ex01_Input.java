
import java.util.Scanner;

public class Ex01_Input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name;
        int age;
        char gender;
        float tail;
        double weight;

        System.out.println("이름을 입력하시오");
        name = sc.nextLine();
        System.out.println("나이를 입력하시오");
        age = sc.nextInt();
        System.out.println("성별을 입력하시오");
        gender = sc.next().charAt(0);
        System.out.println("신장을 입력하시오");
        tail = sc.nextFloat();
        System.out.println("체중을 입력하시오");
        weight = sc.nextDouble();

        System.out.println("나의 이름은" + name + "입니다.");
        System.out.println("나의 나이는" + age + "입니다.");
        System.out.println("나의 성별은" + gender + "입니다.");
        System.out.println("나의 키는" + tail + "입니다.");
        System.out.println("나의 체중은" + weight + "입니다.");
    }
}
