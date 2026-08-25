public class gcd {
    public static int fun(int a,int b){
    while(b!=0)
    {
        int rem = a%b;
        a=b;
        b=rem;
    }
    return a;
}
        
    public static void main(String[]args){
        int[] a={8,10,12,14,16};
        int gcd= a[0];
        for(int i=1;i<5;i++)
        {
            gcd = fun(gcd,a[i]);
        }
        System.out.print("GCD ="+gcd);
        }
    }
    
