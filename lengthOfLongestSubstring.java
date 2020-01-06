import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class lengthOfLongestSubstring {
    public int answer(String s) {
        int leng = s.length();
        Set<Character> dict = new HashSet<>();
        int begin = 0;
        int end = 0;
        int max = 0;
        while (begin < leng && end < leng) {
            if (dict.contains(s.charAt(end))) {
                dict.remove(s.charAt(begin));
                begin++;
            } else {
                dict.add(s.charAt(end));
                end++;
                if (end - begin > max) {
                    max = end - begin;
                }
            }
        }
        return max;
    }
}
