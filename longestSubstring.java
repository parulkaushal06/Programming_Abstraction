import java.util.*;
public class longestSubstring {
    public static int longestSubstringWithoutDuplicates(String s){
        
        HashSet<Character> set = new HashSet<>();
        int left = 0;
        int max = 0;
        for(int right = 0; right<s.length(); right++){
            char curr = s.charAt(right);
            while(set.contains(curr)){
                set.remove(s.charAt(left));
                left++;
            }
            set.add(curr);
            max = Math.max(max, right-left+1);
        }
        return max ;
    }
    public static void main(String[] args) {
        String str = "abcadda";
        System.out.println(longestSubstringWithoutDuplicates(str));
    }
}
