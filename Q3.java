/*
    *****
    ****
    ***
    **
    *

 */

public class Q3 {
    
    public static void main(String[] args) {
        q3(5);
    }
    static void q3(int n)
    {
        for (int i = 0; i < n; i++) {
            for(int j=0; j<n-i; j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
