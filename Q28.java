/*
         *
        * *
       * * *
      * * * *
     * * * * *
      * * * *
       * * *
        * *
         *
 */

public class Q28 {
    public static void main(String[] args) {
        q28(10);
    }
    static void q28(int n)
    {
        for(int i=0; i<2*n-1; i++)
        {
            if(i<n)
            {
                for(int j=0; j<n-i;j++)System.out.print(" ");
                for(int k=0; k<=i;k++) System.out.print("* ");
            }
            else{
                for(int j=0; j<=i%n+1;j++)System.out.print(" ");
                for(int k=0; k<n-i%n-1;k++) System.out.print("* ");
            }
            System.out.println();
        }
    }
}
