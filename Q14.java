/*
     *********
      *     *
       *   *
        * *
         *

 */

public class Q14 {
    public static void main(String[] args) {
        q14(20);
    }

    static void q14(int n) {
        for (int i = 0; i < n; i++) {
            int space = i;
            for (int j = 0; j < space; j++)
                System.out.print(" ");
            if (i == n-1)
                System.out.print("*");
            else if (i == 0) {
                for (int u = 0; u < 2 * n-1; u++)
                    System.out.print("*");
            } else {
                System.out.print("*");
                for (int k = 0; k < 2*n - i * 2 - 3; k++)
                    System.out.print(" ");
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
