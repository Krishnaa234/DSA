//Longest Substring Without Repeating Characters

class LongestSubstring {
    public int lengthOfLongestSubstring(String s) {
        int end =0, start =0;
        Set<Character> seen = new HashSet();
        int max = 0;
        while( start < s.length()) {
            char C = s.charAt(start);
            if(seen.add(C)) {
                //if c is added in seen then calculate it's length and compare it with max
                max = Math.max(max,start - end +1); //max and slider window size is compared
                start++;
            }
            else {
                while(s.charAt(end)!=C) {
                    seen.remove(s.charAt(end));
                    end++;
                    //remove till you find the duplicate character
                }
                seen.remove(C); //removed from the set
                end++;
            }
        }
        return max;
    }
}
