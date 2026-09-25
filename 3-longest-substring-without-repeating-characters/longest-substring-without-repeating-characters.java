class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set1 = new HashSet<>();
         int l = 0;
         int maxlen = 0;
         for(int r = 0; r < s.length();r++){
            while(set1.contains(s.charAt(r))){
                set1.remove(s.charAt(l));
                l++;
            }
            set1.add(s.charAt(r));
            maxlen = Math.max(maxlen,set1.size());
         }
         return maxlen;
    }

}