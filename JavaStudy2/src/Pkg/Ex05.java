package Pkg;

public class Ex05 {
    public static void main(String[] args) {
        String str1 = new String("JAVA");
        String str2 = new String("www.Google.com");
        String str3 = new String("Yuhan University");

        for(int i=0 ; i < str1.length(); i++){
            System.out.print(str1.charAt(i) +" ");
        }

        System.out.println("\n"+str1);
        String[] arrstr2;
        arrstr2 = str2.split("\\.");
        for(int i=0 ; i < arrstr2.length; i++){
            System.out.print(arrstr2[i] +" ");
        }
        System.out.println();
        System.out.println(str3.toUpperCase());
        System.out.println(str3.toLowerCase());




    }
}
