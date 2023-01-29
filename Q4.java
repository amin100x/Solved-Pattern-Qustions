/*
    1
    1 2
    1 2 3
    1 2 3 4
    1 2 3 4 5
 */

public class Q4 {
    public static void main(String[] args) {
        q4(5);
    }
    static void q4(int n)
    {
        for (int i = 1; i <= n; i++) {
            for(int j=1; j<=i; j++)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
