package secss;

class person{
    private String name;
    private String phone;

    person(){}

    person(String name,String phone){
        this.name=name;
        this.phone=phone;
    }

    void PrintInfo(){
        System.out.println("Name: "+name);
        System.out.println("Phone: "+phone);
    }
}

class Student extends person{
    private int score;

    Student(int score,String name,String phone){
        super(name,phone);
        this.score=score;
    }

    void PrintInfo(){
        super.PrintInfo();
        System.out.println("Score: "+score);
    }

}

public class Code128 {
    public static void main(String[] args) {
        person p = new person();
        Student s = new Student(85,"sam","01099999999");


        p.PrintInfo();
        System.out.println();
        s.PrintInfo();

    }
}
