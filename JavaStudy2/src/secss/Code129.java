package secss;

class Parent3 {
    int data = 10;
    int a = 10;

}

class child extends Parent3 {
    int data = 21;

    void printData(){
        System.out.println("data from Parent : "+ super.data);
        System.out.println("data from child  : " + this.data);
        System.out.println("data from child : " + data);
        System.out.println(a);
    }
}

public class Code129 {
    public static void main(String[] args) {
        child obj = new child();
        obj.printData();
    }
}
