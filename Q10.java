/*
         *
        * *
       * * *
      * * * *
     * * * * *
 */

public class Q10 {
    public static void main(String[] args) {
        q10(5);
    }
    static void q10(int n)
    {
        for (int i = 0; i < n; i++) {
            int space = n-i+1;
            for(int j=0;j<space; j++) System.out.print(" ");

            for(int k=0; k<=i; k++) System.out.print("* ");
            System.out.println();
        }
    }
}
