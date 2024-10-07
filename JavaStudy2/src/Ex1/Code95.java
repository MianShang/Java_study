package Ex1;

class Date{
    int value;
    static int count;

    void  print(){
        System.out.print("value = "+value++ +" ");
        System.out.println("count = "+count++);
    }
}

public class Code95 {

    public static void main(String[] args) {
        Date d1 = new Date();
        Date d2 = new Date();
        d1.print(); //d1에서 처음 불러와서 후위형으로 더해졌음 count 는 static이기 때문에 d2 count와 공유
        d2.print(); //d2에서 value는 처음 불러와 후위형으로 처음 더해지지만 count 는 메모리 공유로인해 이미 증가된값에 후휘영 값을 더한다.

        d1.print(); //d1의 값 value는 이전에 후위형으로 더해진 1이지만 count 는 이전의 d1,d2의 더한 값인 2가 출력되서 후위로 더해져서 3인 값인 상태
        d2.print(); //d2의 값 value는 d1과 똑같이 d2에서는 한번만 더해졌음으로 1출력 값은 2로 변경되고 count 는 3출력 4로 변경 된다.
    }
}
