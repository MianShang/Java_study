package Ex1;

public class for2 {
        public static void main(String[] args) {
            int[] s = {11, 22, 33, 44, 55};
            String[] ss = {"빨강", "주황", "노랑", "초록", "파랑", "남색","보라"};

/*		for(int i=0; i<s.length; ++i) {
			System.out.print(s[i]+" ");
		}
		System.out.println("------------------");
		for(int i=0; i<ss.length; ++i) {
			System.out.print(ss[i]+" ");
		}   */



            for(int i : s) {   // ( 앞쪽은 자료형 : 뒤쪽은 배열명(s, ss)
                System.out.println(i+" ");
            }

            for(String i : ss) {
                System.out.print(i+" ");

            }
    }
}
