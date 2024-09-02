public class Ex20_For {
    public static void main(String[] args) {
        for(int i=100; i>=80; i-=3){
            System.out.print(i+" ");
        }
        System.out.println("\n"); ///줄바꿈


        for (char j='A';j<='Z';j++){
            System.out.print(j+" ");
        }

        System.out.println("\n");

        for (char i='Z';i>='A';i--){
            System.out.print(i+" ");
        }

        System.out.println("\n");

        int sum=0, odd=0, even=0;

        for (int i=1; i<=100; i++){
            sum+=i;

            switch (i%2){
                case 0: even += i; break;
                case 1: odd += i; break;
            }
        }

        System.out.println("1-100까지의 전체합: "+sum);
        System.out.println("1-100까지의 홀수합 : "+odd);
        System.out.println("1-100까지의 짝수합 : "+even);

        sum=0;
        odd=0;
        even=0;

        for(int i=7; i<=100; i+=7){
            sum+=i;
        }
        System.out.println("1-100까지의 전체합: "+sum);
        System.out.println("1-100까지의 홀수합 : "+odd);
        System.out.println("1-100까지의 짝수합 : "+even);

    }
}
