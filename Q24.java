/*
       *        *
       **      **
       * *    * *
       *  *  *  *
       *   **   *
       *   **   *
       *  *  *  *
       * *    * *
       **      **
       *        *

 */
public class Q24 {
    public static void main(String[] args) {
        q24(15);
    }

    static void q24(int n) {
        for (int i = 0; i < 2 * n; i++) {
            if (i == 0 || i == 2 * n - 1) {
                for (int j = 0; j < 2 * n; j++) {
                    if (j == 0 || j == 2 * n - 1)
                        System.out.print("*");
                    else
                        System.out.print(" ");
                }
            } else if (i < n) {
                System.out.print("*");
                for (int k = 0; k < i - 1; k++)
                    System.out.print(" ");
                System.out.print("*");
                for (int l = 0; l < 2 * n - 2 * i - 2; l++)
                    System.out.print(" ");
                System.out.print("*");
                for (int k = 0; k < i - 1; k++)
                    System.out.print(" ");
                System.out.print("*");
            }
            else{
                System.out.print("*");
                for (int k = 0; k <n- i%n - 2; k++)
                    System.out.print(" ");
                System.out.print("*");
                for (int l = 0; l <(i%n)*2 ; l++)
                    System.out.print(" ");
                System.out.print("*");
                for (int k = 0; k <n- i%n - 2; k++)
                    System.out.print(" ");
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
