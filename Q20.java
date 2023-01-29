/*
       ****
       *  *
       *  *
       *  *
       ****
 */

public class Q20 {
    public static void main(String[] args) {
        q20(5);
    }

    static void q20(int n) {
        for (int i = 0; i <= n; i++) {
            if (i == 0 || i == n)
                for (int j = 0; j < n; j++)
                    System.out.print("*");
            else {
                for (int k = 0; k < n; k++) {
                    if (k == 0 || k == n - 1)
                        System.out.print("*");
                    else System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
