/*
       1
       0 1
       1 0 1
       0 1 0 1
       1 0 1 0 1
 */

public class Q22 {
    public static void main(String[] args) {
        q22(5);
    }

    static void q22(int n) {
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                for (int j = 1; j <= i; j++) {
                    if(j%2==0) System.out.print("0 ");
                    else System.out.print("1 ");
                }
            }
            else {
                for (int j = 1; j <= i; j++) {
                    if(j%2==0) System.out.print("1 ");
                    else System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }
}
