class Solution {
    public int lengthOfLongestSubstring(String s) {
        // SO first created a set for storing then then used sliding window basic concept for checking occurances as soon as we find that the element is already present in the set then we remove from left and add element from right and then return length or whatever we are requried to give
        Set<Character> set1 = new HashSet<>();
         int l = 0;
         int maxlen = 0;
         for(int r = 0; r < s.length();r++){
            while(set1.contains(s.charAt(r))){
                set1.remove(s.charAt(l));
                l++;
            }
            set1.add(s.charAt(r));
            maxlen = Math.max(maxlen,r - l + 1);
         }
         return maxlen;
    }

}