/*
              1
            1   1
          1   2   1
        1   3   3   1
      1   4   6   4   1
 */

public class Q16 {
    public static void main(String[] args) {
        q26(5);
    }
    static void q26(int n)
    {
        for(int i=0; i<n; i++)
        {
            int num=1;
            for(int j=0; j<n-i;j++) System.out.print("  ");
            for(int k=0; k<=i;k++)
            {
                System.out.print(num+"   ");
                num = num * (i-k)/(k+1);
            }
            System.out.println();
        }
    }
}
