public class PalindromeNumber {
    public boolean isPalindrome(int x) {
        String reverse = "";
        int length = String.valueOf(x).length();
        String y = String.valueOf(x);
        for ( int i = length - 1; i >= 0; i-- )
            reverse = reverse + y.charAt(i);
        if (y.equals(reverse))
            return true;
        else
            return false;
    }
}
