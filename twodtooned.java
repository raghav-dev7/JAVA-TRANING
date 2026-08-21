import java.util.*;
public class twodtooned {
    public static void main(String[]args)
    {
        int a[][] = {{1,2,3,4},{3,4,5,6},{3,7,5,8},{2,5,5,9}};
        int r = a.length;
        int c = a[0].length;
        int k=0;
        int h[] = new int[r*c];
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
        {
           h[k]= a[i][j];
           k++;
        }
        }
        for(int i = 0;i<h.length;i++)
        {
            System.out.print(h[i]+" ");
        }
    }
}
