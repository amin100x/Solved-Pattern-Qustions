/*
0 0 0 0 0 0 0 0 0 
0 1 1 1 1 1 1 1 0 
0 1 2 2 2 2 2 1 0 
0 1 2 3 3 3 2 1 0 
0 1 2 3 4 3 2 1 0 
0 1 2 3 3 3 2 1 0 
0 1 2 2 2 2 2 1 0 
0 1 1 1 1 1 1 1 0 
0 0 0 0 0 0 0 0 0
 */

public class QEE31 {
    public static void main(String[] args) {
        q31(4);
    }
    static void q31(int n)
    {
        for(int i=0; i<=2*n; i++)
        {
            for(int j=0; j<=2*n; j++)
            {
                int v= Math.min(Math.min(i,j), Math.min(2*n-i, 2*n-j));
                System.out.print(v+" ");
            }
            System.out.println();
        }
    }
}
