
public class LongestPalindromicString{
    public String longestPalindrome(String s) {
        if (s == null || s.length() < 1) {
            return "";
        }
        int begin = 0, end = 0;
        for (int i = 0; i < s.length(); i++) {
            int len1 = expandAroundCenter(s, i, i); // The first case of center
            int len2 = expandAroundCenter(s, i, i+1); // Second case
            int bigger = Math.max(len1, len2);
            if (bigger > end - begin) {
                begin = i - (bigger - 1)/2;
                end = i + (bigger)/2
            }
        }
        return s.substring(begin, end+1);
    }

    private int expandAroundCenter(String s, int begin, int end) {
        int left = begin;
        int right = end;
        while (left > 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        return right - left - 1;
    }
}
