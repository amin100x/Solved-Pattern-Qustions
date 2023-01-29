/*
       E D C B A
       D C B A
       C B A
       B A
       A
 */

public class Q34 {
    public static void main(String[] args) {
        q34(5);
    }
    static void q34(int n)
    {
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<n-i; j++)
            {
                System.out.print((char)(n-1+65-j-i)+" ");
            }
            System.out.println();
        }
    }
}
