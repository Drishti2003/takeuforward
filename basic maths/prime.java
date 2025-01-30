public class prime {
    public static void main(String[] args) {
        isPrime(5);
    }

    public static boolean isPrime(int num) {
        // Your code goes here
        for (int i = 2; i < num; i++) {
            if (num % i == 0)
                return false;
        }
        return true;
    }
}
