package Pkg;

public class Ex06_2 {
    public static void main(String[] args) {
        StringBuffer sb2 = new StringBuffer("water");
        StringBuffer sb3 = new StringBuffer("wafer");
        //System.out.println(sb2.charAt(5)); 기존의 크기보다 더큰 값을 출력할 경우 Error

        StringBuffer sb4 = new StringBuffer("Java Programming Language");
        sb4.delete(5, 8);
        System.out.println(sb4);

        StringBuffer sb5 = new StringBuffer("Hello World");
        sb5.insert(5, ',');
        System.out.println("Sb5 : "+sb5);
        System.out.println("sb5.substring(7) : "+sb5.substring(7));
    }
}
