package Intf;

interface Person{
    abstract void print();
}

class Teacher implements Person{
    public void print(){
        System.out.println("Teacher print");
    }
}

class Student implements Person{
    public void print(){
        System.out.println("Student print");
    }
}



public class Code170
{
    public static void main(String[] args) {
        Person t = new Student();
        Person s = new Student();
        t.print();
        s.print();
    }
}
