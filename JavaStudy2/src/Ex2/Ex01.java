package Ex2;

class sj2 {
    int korea;
    int english;
    int math;
    int total;
    float avg;
}

public class Ex01 {
    public static void main(String[] args) {
        sj2 s1 = new sj2();

        s1.korea = 91;
        s1.english = 77;
        s1.math = 82;

        s1.total = s1.korea + s1.english + s1.math;
        s1.avg = s1.total / (float)3;

        System.out.println(s1.avg);
        System.out.println(s1.korea);
        System.out.println(s1.english);
        System.out.println(s1.math);
        System.out.println(s1.total +"\n");

        sj2 s2 = new sj2();

        s2.korea = 91;
        s2.english = 77;
        s2.math = 82;

        s2.total = s2.korea + s2.english + s2.math;
        s2.avg = s2.total / (float) 3;

        System.out.println(s2.avg);
        System.out.println(s2.korea);
        System.out.println(s2.english);
        System.out.println(s2.math);
        System.out.println(s2.total);

        sj2 s3 = new sj2();

        s3.korea = 91;
        s3.english = 77;
        s3.math = 82;

        s3.total = s3.korea + s3.english + s3.math;
        s3.avg = s3.total / (float)3;

        System.out.println(s3.avg);
        System.out.println(s3.korea);
        System.out.println(s3.english);
        System.out.println(s3.math);
        System.out.println(s3.total);



    }
}
