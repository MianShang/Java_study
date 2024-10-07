package Ex1;

public class Student {

    private String name;
    private int score;

    Student(String name, int score) {
        this.name = name;
        this.score = score;
    }

    String getName() {
        return name;
    }
    int getScore() {
        return score;
    }

    void print(){
        System.out.println(name + "("+score+")");
    }


    public static void main(String[] args) {
        Student st[] = new Student[5];

        st[0] = new Student("백두산", 87);
        st[1] = new Student("한라산", 99);
        st[2] = new Student("금강산", 77);
        st[3] = new Student("태백산", 91);
        st[4] = new Student("지리산", 85);

        int total = 0;
        for(int i=0; i < st.length; i++) {
            total += st[i].getScore();
        }

        double ave = (double)total / st.length;

        System.out.println("평 균 : " + ave);
    }
}
