public class prime {
    public static int sod(int a) {
        int b = 0;
        while (a > 0) {
            b = b + (a % 10);
            a = a / 10;
        }
        return b;
    }
    public static boolean prime(int a) {
        if (a < 2)
            return false;
        for (int i=2;i < a;i++) {
            if (a % i == 0)
                return false;
        }

        return true;
    }
    public static void main(String[] args) {
        for (int i = 100; i < 1000; i++) {
            int s = sod(i);
            if (prime(i) && prime(s)) {
                System.out.println(i);
            }
        }
    }
}