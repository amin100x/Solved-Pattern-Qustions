/*
       a
       B c
       D e F
       g H i J
       k L m N o
 */

public class Q33 {
    public static void main(String[] args) {
        q33(5);
    }

    static void q33(int n)
    {
        int c=0;
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<=i; j++)
            {
                if(c%2==0) 
                    System.out.print((char)(97+c)+" ");
                else System.out.print((char)(65+c)+" ");
                c++;
            }
            System.out.println();
        }
    }
}
