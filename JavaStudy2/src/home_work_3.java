import javax.xml.namespace.QName;
import java.util.Scanner;

class member2{
    private  String name;          /// 회원 이름
    private  int age;              /// 회원 나이
    static private  int membernumber = 0;    /// 회원 번호
    private  int phone;            /// 회원 전화번호

    member2(String name, int age,int phone){
        this.name = name;
        this.age = age;
        this.phone = phone;
        membernumber++;
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public int getPhone(){
        return phone;
    }

    public int getNumber(){
        return membernumber;
    }

}

class grademember extends member2{

    private  String grade;
    private  int sale;
    private  int freemoney;

    grademember(String name,int age,int phone,String grade,int sale,int freemoney){
        super(name,age,phone);
        this.grade = grade;
        this.sale = sale;
        this.freemoney = freemoney;
    }

    public String getGrade(){
        return grade;
    }

    public int getFreemoney(){
        return freemoney;
    }

    public int getSale(){
        return sale;
    }

}


public class home_work_3 {
    public static void main(String[] args) {

        String member[] = new String[4];
        Scanner s = new Scanner(System.in);
        int sale;
        int freemoney;
        int swnum;
        int membernumber=0;
        grademember[] grm = new grademember[100];
        int i =0;

        while (true) {



            System.out.print("1 회원정보 추가, 2 회원정보 확인, 0 종료 : ");
            swnum = s.nextInt();
            s.nextLine();

            if(swnum == 0){
                break;
            }

            switch (swnum) {
                case 1:

                    System.out.print("이름 : ");
                    member[0] = s.nextLine();

                    System.out.print("나이 : ");
                    member[1] = s.nextLine();

                    System.out.print("전화번호(-없이 입력) : ");
                    member[2] = s.nextLine();

                    System.out.print("등급 : ");
                    member[3] = s.nextLine();

                    if (member[3].equals("vip")) {
                        sale = 50;
                        freemoney = 30000;
                    } else {
                        sale = 0;
                        freemoney = 0;
                    }

                    System.out.println();

                    grm[i] = new grademember(member[0], Integer.parseInt(member[1]), Integer.parseInt(member[2]), member[3], sale, freemoney);

                    System.out.println("입력된 정보");
                    System.out.println("회원 번호 : " + grm[i].getNumber());
                    System.out.println("이름 : " + grm[i].getName());
                    System.out.println("나이 : " + grm[i].getAge());
                    System.out.println("전화번호 : " + grm[i].getPhone());
                    System.out.println("등급 : " + grm[i].getGrade());
                    System.out.println();

                    if (member[3].equals("vip")) {

                        System.out.println("VIP 할인율 : " + grm[i].getSale());
                        System.out.println("VIP 특전 30000원 무료 쿠폰");
                        System.out.println("남은 쿠폰 잔액 : " + grm[i].getFreemoney());
                        System.out.println();
                    }

                    i++;

                    break;

                case 2:
                    System.out.print("회원번호 입력 : ");
                    membernumber = s.nextInt();
                    membernumber -=1;

                    System.out.println("회원 정보");
                    System.out.println("회원 번호 : " + grm[membernumber].getNumber());
                    System.out.println("이름 : " + grm[membernumber].getName());
                    System.out.println("나이 : " + grm[membernumber].getAge());
                    System.out.println("전화번호 : " + grm[membernumber].getPhone());
                    System.out.println("등급 : " + grm[membernumber].getGrade());
                    System.out.println();

                    if (grm[membernumber].getGrade().equals("vip")) {

                        System.out.println("VIP 할인율 : " + grm[membernumber].getSale());
                        System.out.println("VIP 특전 30000원 무료 쿠폰");
                        System.out.println("남은 쿠폰 잔액 : " + grm[membernumber].getFreemoney());
                        System.out.println();
                    }

                    break;

                default:
                    System.out.println("잘못 입력하였습니다. 다시 입력하세요");
                    break;

            }


        }


    }
}
