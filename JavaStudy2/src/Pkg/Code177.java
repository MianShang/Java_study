package Pkg;

class Thing2 extends Object {

    private String name;
    private int count;

    Thing2( ){}

    Thing2(String name, int count) {
        this.name = name;
        this.count = count;
    }

    void print( ) {
        System.out.println("name : " + name);
        System.out.println("count : " + count);
    }
    // 오버라이딩 해서  인스턴스가 가지고 있는 변수 값이 같으면 true
    public boolean equals(Object obj) {
        if (this.name.equals(((Thing2)obj).name) && this.count == ((Thing2)obj).count)
            return true;
        return false;
    }
}

public class Code177 {
    public static void main(String[] args) {
        Thing2 th1 = new Thing2("desk", 5);
        Thing2 th2 = new Thing2("desk", 5);

        if (th1.equals(th2)) System.out.println("Same Thing");
        else System.out.println("Different Thing");

        System.out.println();
        System.out.println("th1 print");
        th1.print();
        System.out.println();
        System.out.println("th2 print");
        th2.print();
    }
}
