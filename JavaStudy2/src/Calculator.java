public class Calculator {
    public int a,b;
    public String c;
    private double sum;
    private int sum2;

    public Calculator(int a, int b, String c) {
        this.a = a;
        this.b=b;
        this.c = c;

        switch (this.c){
            case "+":
            {
                sum2 = a+b;
            }
            break;

            case "-":
            {
                sum2 = a-b;
            }
            break;

            case "*" :
            {
                sum2 = a*b;
            }
            break;

            case "/" :
            {
                sum =(double) a/b;
            }
            break;

            default :
                System.out.println("시스템 오류");
                break;
        }

    }

    public int getSum2(){
        return sum2;
    }

    public double getSum() {
        return sum;
    }

}
