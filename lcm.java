public class lcm {
    public static int fun(int a,int b)
    {
        int big=Math.max(a,b);
        int small=Math.min(a,b);
        int o=big;
        while(true)
        {
            if(big % small==0)
            break;
            big=big+o;
        }
        return big;

    }
    public static void main(String[]args){
        int[] a={12,45,13,10,18,14,15};
        int lcm=a[0];
        for(int i=1;i<6;i++)
        {
            lcm=fun(lcm,a[i]);
        }
        System.out.println("LCM = " + lcm);

    }
}
