/*
        *
       ***
      *****
     *******
    *********
 */

public class Q8 {
    public static void main(String[] args) {
        q8(5);
    }
    static void q8(int n)
    {
        for (int i = 1; i <= n; i++) {
            int space = n-i;
            for(int j=0;j<space; j++) System.out.print(" ");

            for(int k=1; k<=i*2-1; k++) System.out.print("*");
            System.out.println();
        }
    }
}
