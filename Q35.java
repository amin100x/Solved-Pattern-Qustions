/*
       1      1
       12    21
       123  321
       12344321
 */

public class Q35 {
    public static void main(String[] args) {
        q35(5);
    }
    static void q35(int n)
    {
        for (int i = 1; i <=n; i++) {
            for(int j=1; j<=i;j++)
            {
                System.out.print(j);
            }
            for(int k=0;k<2*n-2*i;k++) System.out.print(" ");
            for(int j=i; j>=1;j--)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
