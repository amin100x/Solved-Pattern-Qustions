/*
         *
        **
       ***
      ****
     *****
 */
public class Q6 {
    public static void main(String[] args) {
        q6(5);
    }
    static void q6(int n)
    {
        for (int i = 0; i < n; i++) {
            int space = n-i+1;
            for(int j=0;j<space; j++) System.out.print(" ");

            for(int k=0; k<=i; k++) System.out.print("*");
            System.out.println();
        }
    }
}
