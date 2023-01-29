/*
         1
        212
       32123
      4321234
       32123
        212
         1
 */

public class Q17 {
    public static void main(String[] args) {
        q30(9);
    }

    static void q30(int n) {
        for (int i = 1; i <= 2 * n; i++) {
            if (i < n) {
                int s = n - i;
                for (int j = 0; j < s; j++)
                    System.out.print(" ");
                for (int k = i; k >= 1; k--)
                    System.out.print(k);
                for (int u = 2; u <= i; u++)
                    System.out.print(u);
            }
            else{
                int s = i%n;
                for (int j = 0; j < s; j++)
                    System.out.print(" ");
                for (int k = n-i%n; k >= 1; k--)
                    System.out.print(k);
                for (int u = 2; u <= n-i%n; u++)
                    System.out.print(u);
            }

            System.out.println();
        }
    }
}
