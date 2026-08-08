class Solution {
    public boolean isPalindrome(int x) {

        // Negative numbers are not palindromes
        if (x < 0) {
            return false;
        }

        // Numbers ending in 0 cannot be palindromes,
        // except 0 itself
        if (x != 0 && x % 10 == 0) {
            return false;
        }

        int reversed = 0;

        // Reverse only half of the number
        while (x > reversed) {

            int digit = x % 10;
            reversed = reversed * 10 + digit;
            x = x / 10;
        }

        // Even number of digits:
        // x == reversed
        //
        // Odd number of digits:
        // ignore the middle digit using reversed / 10
        return x == reversed || x == reversed / 10;
    }
}