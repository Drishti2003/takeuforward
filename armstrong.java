import java.util.Scanner;

public class armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        armstrong m = new armstrong();
        System.out.println(m.armstrong_num(n));
    }

    public boolean armstrong_num(int n) {
        int num = n, d, sum = 0, c = Integer.toString(n).length();
        while (n > 0) {
            d = n % 10;
            n /= 10;
            sum += Math.pow(d, c);
        }
        if (num == sum)
            return true;
        else
            return false;
    }
}
