/*
      1 1 1 1 1 1
      2 2 2 2 2
      3 3 3 3
      4 4 4
      5 5
      6
 */

public class Q26 {
    public static void main(String[] args) {
        q26(8);
    }
    static void q26(int n)
    {
        for (int i = 1; i <= n; i++) {
            for(int j=i;j<=n;j++)
            {
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
