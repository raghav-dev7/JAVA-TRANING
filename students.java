import java.util.*;
public class students {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] marks = new int[5];
        String[] names = new String[5];
        for (int i = 0; i < 5; i++) 
        {
            System.out.println("Enter Student name and mark" + (i + 1));
            marks[i] = s.nextInt();
            s.next();
            names[i] = s.nextLine();        
        }
        System.out.println("*************");
        int a = 0;
        for (int i = 0; i < 5; i++) {
            if (marks[i] > 50)
            {
                System.out.println(a +" " + names[i] + " has scored " + marks[i]);
                a++;
            }
        }
    }
}