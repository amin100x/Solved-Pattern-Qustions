/*
    *********
     *******
      *****
       ***
        *
 */

public class Q9 {
    public static void main(String[] args) {
        q9(5);
    }
    static void q9(int n)
    {
        for (int i = n; i>0; i--) {
            int space = n-i;
            for(int j=0;j<space; j++) System.out.print(" ");

            for(int k=2*i-1; k>0; k--) System.out.print("*");
            System.out.println();
        }
    }
}
