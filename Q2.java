/*
    *
    **
    ***
    ****
    *****
 */

public class Q2 {
    public static void main(String[] args) {
        q2(5);
    }
    static void q2(int n)
    {
        for (int i = 0; i < n; i++) {
            for(int j=0; j<=i; j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
