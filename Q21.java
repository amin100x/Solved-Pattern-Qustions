/*
       1
       2  3
       4  5  6
       7  8  9  10
       11 12 13 14 15
 */

public class Q21 {
    public static void main(String[] args) {
        q21(5);
    }
    static void q21(int n)
    {
        int c=1;
        for(int i=0; i<n;i++)
        {
            for(int j=0; j<=i; j++)
            {
                System.out.print(c+" ");
                c++;
            }
            System.out.println();
        }
    }
}
