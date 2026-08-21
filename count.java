public class count {
    public static void main(String[]args)
    {
        String a = "aabbbccccddd";
        String y ="";
        int c=1;
        for(int i=0;i<a.length();i++)
        {
            if (i+1<a.length() && a.charAt(i) == a.charAt(i+1))
            {
                c++;
            }
            else{
            y= y+a.charAt(i);
            y= y+Integer.toString(c);
            c=1;
            }
        }
        System.out.println(y);

    }
}
