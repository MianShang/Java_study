package Ex2;

class Sj{
    int kor;
    int eng;
    int mat;
    int tot;
    float avg;

    public Sj(int k, int e, int m){
        this.kor = k;
        this.eng = e;
        this.mat = m;
        this.tot = kor + eng + mat;
        this.avg = tot / (float)3;
    }

    void print(){
        System.out.println(this.kor);
        System.out.println(this.mat);
        System.out.println(this.eng);
        System.out.println(this.tot);
        System.out.println(this.avg);
        System.out.println();
    }
}

public class Ex02 {

    public static void main(String[] args) {
        Sj s1 = new Sj(99, 88, 77);
        Sj s2 = new Sj(80, 96, 57);
        Sj s3 = new Sj(78, 69, 97);

        s1.print();
        s2.print();
        s3.print();
    }
}
