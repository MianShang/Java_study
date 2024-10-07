package Pkg;

public class Ex06 {
    public static void main(String[] args) {
        ///StringBuffer는 기본적으로 16의 용량 문자열 버퍼를 생성한다.
        ///sb2는 16+hello임으로 = 21의 값이 나옴
        StringBuffer sb = new StringBuffer("Hello");
        StringBuffer sb2 = new StringBuffer();

        sb2.append("World");
        StringBuffer sb3 = new StringBuffer(20);
        sb3.append("Java Program is Created by James Gosling");

        System.out.println(sb);
        sb.append("Programming");
        System.out.println(sb);

        System.out.println("\ninsert");
        sb.insert(6,"JAVA");
        System.out.println(sb);

        System.out.println("\nreplace 1, 4");
        sb.replace(1, 4, "Good");
        System.out.println(sb);

        System.out.println("\ndelete 1, 5");
        sb.delete(1,5);
        System.out.println(sb);

        System.out.println("\nreverse");
        sb.reverse();
        System.out.println(sb);

        System.out.println(sb);
        System.out.println(sb2);
        System.out.println(sb3);
        System.out.println(sb.capacity());
        System.out.println(sb2.capacity());
        System.out.println(sb3.capacity());


    }
}
