package secss;

class Parent{
    void print(){
        System.out.println("P printing");
    }
    void test(){
        System.out.println("P testing");
    }
}

class Child2 extends Parent{
    void print(){
        System.out.println("C printing");
    }
    void check(){
        System.out.println("C checking");
    }
}

public class Code136 {
    public static void main(String[] args) {
        Parent p =new Parent();
        p.print();
        p.test();

        Child2  c = new Child2();
        c.check();
        c.print();
        c.test();

        Parent x = new Child2();
        x.print();
        x.test();

    }
}
