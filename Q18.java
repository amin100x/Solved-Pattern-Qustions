/*
      **********
      ****  ****
      ***    ***
      **      **
      *        *
      *        *
      **      **
      ***    ***
      ****  ****
      **********
 */

public class Q18 {
    public static void main(String[] args) {
        q18(10);
    }
    static void q18(int n)
    {
        for(int i=0; i<2*n; i++)
        {
            if(i==0 || i==2*n-1)
            {
                for(int j=0; j<2*n;j++) System.out.print("*");
            }
            else if(i<n)
            {
                int a=(2*n-2*i)/2;
                for(int u=0; u<a; u++)System.out.print("*");
                for(int v=0; v<2*i; v++)System.out.print(" ");
                for(int r=0; r<a; r++)System.out.print("*");
            }
            else{
                int a=(i%n)+1;
                for(int u=0; u<a; u++)System.out.print("*");
                for(int v=0; v<(n-i%n)*2-2; v++)System.out.print(" ");
                for(int r=0; r<a; r++)System.out.print("*");
            }
            System.out.println();
        }
    }
}
