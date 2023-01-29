/*
      1 2 3 4  17 18 19 20
        5 6 7  14 15 16
          8 9  12 13
            10 11
 */

public class Q27 {
    public static void main(String[] args) {
        q27(5);
    }

    static void q27(int n) {
        int c = 1;
        int a=n*n+1;
        for (int i = 0; i < n; i++) {
            for(int k=0; k<i;k++) System.out.print("  ");
            for (int j = 0; j < n - i; j++) {
                System.out.print(c+" "); 
                c++;
            }
            for(int l=0; l<n-i; l++)
            {
                System.out.print(a+" ");
                a++;
            }
            a = a-(n-i)*2+1;
            System.out.println();
        }
    }
}
