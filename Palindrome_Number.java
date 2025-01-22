public class Palindrome_Number {
    public static void main(String[] args) {
        Palindrome_Number p = new Palindrome_Number();
        System.out.println(p.isPalindrome(10));
    }
    // public boolean isPalindrome(int x) {
    //     System.out.println(x);
    //         System.out.println("success");
    //         String num=String.valueOf(x);
    //         int len = num.length();
    //         for(int start=0,end=len-1;start<=Math.floor(len/2);start++,end--){
    //             if(num.charAt(start) != num.charAt(end) ){
    //                 return false;
    //             }
    //         }
    //     return true;
    // }
    public int reverse_num(int x){
        int sum = 0, digit;
        while (x > 0) {
            digit = x % 10;
            x /= 10;
            sum = (sum * 10) + digit;
        }
        return sum;
    }
    public boolean isPalindrome(int x){
        int num = x;
        if(x<0){
            if(num == reverse_num(x*-1))
            return true;
            else
            return false;
        }
        else 
        if(num==reverse_num(x))
        return true;
        else
        return false;
    }
}
