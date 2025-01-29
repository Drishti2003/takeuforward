package recursion;

public class Valid_Palindrome {
    public static void main(String[] args) {
        Valid_Palindrome v = new Valid_Palindrome();
        System.out.println(v.isPalindrome("race a car"));
    }

    public int i = 0;
    boolean palindrome = true;

    public boolean isPalindrome(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        if (i >= (s.length()) / 2 || palindrome == false) {
            return palindrome;
        }
        if (s.charAt(i) != s.charAt(s.length() - i - 1)) {
            palindrome = false;
        }
        i++;
        isPalindrome(s);
        return palindrome;
    }
}
