class Reverse_Integer {
    public static void main(String[] args) {
        Reverse_Integer r = new Reverse_Integer();
        System.out.println(r.reverse(1534236469));
    }

    public int reverse_num(int x) {
        long sum = 0, digit;
        while (x > 0) {
            digit = x % 10;
            x /= 10;
            sum = (sum * 10) + digit;
        }
        if(sum>Integer.MIN_VALUE && sum<Integer.MAX_VALUE)
        return (int)sum;
        else
        return 0;
    }

    public int reverse(int x) {
        if (x < 0) {
            x *= -1;
            return reverse_num(x) * -1;
        } else 
        return reverse_num(x);

    }
}