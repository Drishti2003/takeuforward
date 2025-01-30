public class count_digits {
    public static void main(String[] args) {
        evenlyDivides(2446);
    }

    static int evenlyDivides(int n) {
        // code here
        int d, num = n, c = 0;
        while (n > 0) {
            d = n % 10;
            n /= 10;
            try {
                if (num % d == 0)
                    c += 1;
            } catch (ArithmeticException e) {

            }
        }
        return c;
    }
}
