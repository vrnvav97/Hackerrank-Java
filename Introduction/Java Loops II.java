import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int sum,j,k;
            for (k=0;k<n;k++)
            {sum =0;
                for (j=0;j<=k;j++)
                {
                    if (j == 0)
                        sum += a + (int)Math.pow(2,j)*b;
                    else
                        sum += (int)Math.pow(2,j)*b;
                }
             System.out.print (sum + " ");
            }
            System.out.println ();
        }
        in.close();
    }
}
