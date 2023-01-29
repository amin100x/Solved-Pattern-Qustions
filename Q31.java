/*
         4 4 4 4 4 4 4  
         4 3 3 3 3 3 4   
         4 3 2 2 2 3 4   
         4 3 2 1 2 3 4   
         4 3 2 2 2 3 4   
         4 3 3 3 3 3 4   
         4 4 4 4 4 4 4
 */

public class Q31 {
    public static void main(String[] args) {
        q31(4);
    }
    static void q31(int n)
    {
        for(int i=1; i<2*n; i++)
        {
            for(int j=1; j<2*n; j++)
            {
                int v= n-Math.min(Math.min(i,j), Math.min(2*n-i, 2*n-j));
                System.out.print(v+1+" ");
            }
            System.out.println();
        }
    }
}
