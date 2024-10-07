package Pkg;

///스택 메모리, heap 메모리
///객체 생성시 heap 메모리에 생성된다.

class Thing extends Object {
    private String name;
    private int count;

    Thing(){}
    Thing(String name,int count){
        this.name=name;
        this.count=count;
    }

    void print(){
        System.out.println("name : "+name);
        System.out.println("count : "+count);
    }

}

public class Code176
{
    public static void main(String[] args) {
        Thing th1 = new Thing("desk",5);
        Thing th2 = new Thing("desk",5);
        ///th1은 heap메모리에 처음 생성되고
        ///th2가 th1의 heap메모리 다음에 생성된다.
        ///변수 th1과 변수 th2는 객체의 주소를 가르킴으로
        ///th1과 th2를 비교 연산자를 사용하면 주소를 비교함으로 다르게 나온다.


        if(th1 == th2){
            System.out.println("Same Thing");
        }
        else {
            System.out.println("Different Thing");
        }

        if(th1.equals(th2)){
            System.out.println("Same Thing");
        }
        else {
            System.out.println("Different Thing");
        }

        System.out.println(th1);
        System.out.println(th2);

    }
}
