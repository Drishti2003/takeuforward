public class LCM_And_GCD {
    public static void main(String[] args) {
        System.out.println(lcmAndGcd(36, 40)[0]);
    }

    public static int[] lcmAndGcd(int a, int b) {
        int[] arr = { 1, 1 };
        for (int i = 1; i <= (a < b ? a : b); i++) {
            if (a % i == 0 && b % i == 0)
                arr[1] = i;
        }
        for (int i = 1; i <= (a > b ? a : b); i++) {
            if (a % i == 0 && b % i == 0) {
                arr[0] *= i;
                b /= i;
                a /= i;
            } else if (a % i == 0) {
                arr[0] *= i;
                a /= i;
            } else if (b % i == 0) {
                arr[0] *= i;
                b /= i;
            }
        }
        arr[0] *= a == b ? a : a * b;
        return arr;
    }
}
