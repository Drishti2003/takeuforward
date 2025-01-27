public class Sum_of_all_divisors {
    public static void main(String[] args) {
        System.out.println(sumOfAllDivisors(3));
    }

    // public static int sumOfDivisors(int n){
    // int sum =0;
    // for(int i=1;i<=n;i++)
    // if(n%i==0)
    // sum+=i;
    // return sum;
    // }
    public static int sumOfAllDivisors(int n) {
        // Write your code here.
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j * j <= i; j++)
                if (i % j == 0) {
                    sum += j;
                    if (i / j != j)
                        sum += (i / j);
                }
        }
        return sum;
    }
}
