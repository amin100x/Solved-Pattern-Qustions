/*
         *
        * *
       *   *
      *     *
     *       *
      *     *
       *   *
        * *
         *
 */

public class Q15 {
    public static void main(String[] args) {
        q15(10);
    }

    static void q15(int n) {

        int c=2*n-6;
        int s =1;
        for (int i = 0; i < 2*n-1; i++) {
            if (i < n) {
                int space = n - i-1;
                for (int j = 0; j < space; j++)
                    System.out.print(" ");
                if (i == 0)
                    System.out.print("*");
                else {
                    System.out.print("*");
                    for (int k = 0; k < i * 2 - 1; k++)
                        System.out.print(" ");
                    System.out.print("*");
                }
            }
            else 
            {
                for (int j = 0; j < s; j++)
                    System.out.print(" ");
                if (i == 2*n-2)
                    System.out.print("*");
                else {
                    System.out.print("*");
                    for (int k = 0; k <=c; k++)
                    {
                        System.out.print(" ");
                    }
                    System.out.print("*");
                }
                s++;
                c-=2;
            }
            System.out.println();
        }

    }

}