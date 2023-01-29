/*
       E
       D E
       C D E
       B C D E
       A B C D E
 */

public class Q32 {
    public static void main(String[] args) {
        q32(5);
    }
    static void q32(int n)
    {
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<=i; j++)
            {
                System.out.print((char)(n-1+65+j-i)+" ");
            }
            System.out.println();
        }
    }
}
