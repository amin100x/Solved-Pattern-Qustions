/*
            1
          2 1 2
        3 2 1 2 3
      4 3 2 1 2 3 4
    5 4 3 2 1 2 3 4 5
 */

public class Q30 {
    public static void main(String[] args) {
        q30(15);
    }
    static void q30(int n)
    {
        for(int i=1; i<=n; i++)
        {
            int s=n-i;
            for(int j=0; j<s;j++) System.out.print("  ");

            for(int k=i; k>=1; k--) System.out.print(k+" ");
            for(int u=2; u<=i; u++) System.out.print(u+" ");

            System.out.println();
        }
    }
}
