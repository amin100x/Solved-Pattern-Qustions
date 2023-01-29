/*
     * * * * *
      * * * *
       * * *
        * *
         *
 */
public class Q11 {
    public static void main(String[] args) {
        q11(5);
    }
    static void q11(int n)
    {
        for (int i = 0; i < n; i++) {
            int space = i;
            for(int j=0;j<space; j++) System.out.print(" ");

            for(int k=n; k>i; k--) System.out.print("* ");
            System.out.println();
        }
    }
}
