package Ex1;

public class Se02 {


    public static void main(String[] args) {

        int[] a = new int[3];
        int[] a1 = {1, 2, 3, 4};

        int[][] aa = new int[3][4];
        int[][] aa1 = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};

        int[][][] aaa = new int[3][4][5];

        System.out.println(a);
        System.out.println(a1[3]);

        System.out.println(aa);
        System.out.println(aa[0]);
        System.out.println(aa1[0][0]);

        System.out.println(aaa);
        System.out.println(aaa[0]);
        System.out.println(aaa[0][0]);
        System.out.println(aaa[0][0][0]);

        int[][] ar = new int[3][4];
        int[][] arr = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};

//		System.out.println(arr[2][1]);

        for (int i = 0; i < arr.length; ++i) {
            for (int j = 0; j < arr[i].length; ++j) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();


        }
    }
}
