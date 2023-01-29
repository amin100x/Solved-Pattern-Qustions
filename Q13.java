/*
         *
        * *
       *   *
      *     *
     *********
 */

public class Q13 {

    public static void main(String[] args) {
        q13(5);
    }

    static void q13(int n) {
        for (int i = 0; i < n; i++) {
            int space = n - i;
            for (int j = 0; j < space; j++)
                System.out.print(" ");
            if (i == 0)
                System.out.print("*");
            else if (i == n - 1) {
                for (int u = 0; u < 2 * n-1; u++)
                    System.out.print("*");
            } else {
                System.out.print("*");
                for (int k = 0; k < i * 2 - 1; k++)
                    System.out.print(" ");
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
