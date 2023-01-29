/*
     * * * * *
      * * * *
       * * *
        * *
         *
         *
        * *
       * * *
      * * * *
     * * * * *
 */

public class Q12 {

    public static void main(String[] args) {
        q12(5);
    }

    static void q12(int n) {
        for (int i = 0; i < 2 * n; i++) {
            if (i < n) {
                int space = i;
                for (int j = 0; j < space; j++)
                    System.out.print(" ");
                for (int k = 0; k < n - i; k++)
                    System.out.print("* ");
            } else {
                int space = 2 * n - i - 1;
                for (int j = 0; j < space; j++)
                    System.out.print(" ");
                for (int k = 0; k <= i % n; k++)
                    System.out.print("* ");
            }
            System.out.println();
        }
    }
}
