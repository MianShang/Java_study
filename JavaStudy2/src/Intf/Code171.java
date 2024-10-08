package Intf;

interface A{
    void test1();
    void test2();
}

interface B{
    void test3();
    void test4();
}

///interface로 인해 오버라이딩으로 메서드 구현
class All implements A,B{
    public void test1(){
        System.out.println("test1");
    }
    public void test2(){
        System.out.println("test2");
    }
    public void test3(){
        System.out.println("test3");
    }
    public void test4(){
        System.out.println("test4");
    }
}

public class Code171 {
    public static void main(String[] args) {
        All x = new All();
        x.test1();
        x.test2();
        x.test3();
        x.test4();
    }
}
