/*
          *****
         *   *
        *   *
       *   *
      *****
 */

public class Q25 {
    public static void main(String[] args) {
        q25(5);
    }
    static void q25(int n)
    {
        for(int i=0; i<n; i++)
        {
            for(int k=0; k<n-i; k++)
                System.out.print(" ");
            if(i==0 || i==n-1)
                for(int j=0; j<n;j++) System.out.print("*");
            else{
                for(int u=0; u<n;u++)
                {
                    if(u==0 || u==n-1)
                        System.out.print("*");
                    else System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
