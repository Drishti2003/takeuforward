public class Sum_of_all_divisors {
    public static void main(String[] args) {
        System.out.println(sumOfAllDivisors(4));
    }

    // public static int sumOfDivisors(int n){
    // int sum =0;
    // for(int i=1;i<=n;i++)
    // if(n%i==0)
    // sum+=i;
    // return sum;
    // }

    public static int sumOfAllDivisors(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++)
                if (i % j == 0)
                    sum += j;
        }
        return sum;
    }
}
