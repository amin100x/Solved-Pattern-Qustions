/*
       *        *
       **      **
       ***    ***
       ****  ****
       **********
       ****  ****
       ***    ***
       **      **
       *        *
 */

public class Q19 {
    public static void main(String[] args) {
        q19(10);
    }
    static void q19(int n)
    {
        for(int i=0; i<2*n-1; i++)
        {
            if(i<n-1)
            {
                for(int j=0;j<=i;j++) System.out.print("*");
                for(int u=0; u<2*n-(i+1)*2;u++) System.out.print(" ");
                for(int k=0;k<=i;k++) System.out.print("*");
            }
            else if(i==n-1)
                for(int r=0; r<2*n;r++)  System.out.print("*");
            else{
                for(int j=0;j<n-i%n-1;j++) System.out.print("*");
                for(int u=0; u<=i%n*2+1;u++) System.out.print(" ");
                for(int k=0;k<n-i%n-1;k++) System.out.print("*");
            }
            System.out.println();
        }
    }
    
}
