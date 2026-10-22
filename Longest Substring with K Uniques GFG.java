class Solution {
    public int longestKSubstr(String s, int k) {
    Set<Character> set = new HashSet<>();
    int maxlen = -1;
    int l = 0;
    for(int i = 0; i < s.length();i++){
        set.add(s.charAt(i));
        while(set.size() > k){
            char out = s.charAt(l);
        l++;
            if(s.substring(l, i+ 1).indexOf(out) == -1){
                set.remove(out);
            }
        }
        if(set.size()== k){
        maxlen = Math.max(maxlen,i - l + 1);
        }
    }
    return maxlen;
    }
}
