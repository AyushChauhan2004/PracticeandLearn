class Solution {
    public int maxNumberOfBalloons(String text) {
     int[] valid = new int[26];
      for (char c : text.toCharArray()) {
            valid[c - 'a']++;
        }
       int b = valid['b' - 'a'];
       int a = valid['a' - 'a'];
       int n = valid['n' - 'a'];
       int o = valid['o' - 'a'] / 2;
       int l = valid['l' - 'a'] / 2;
       int once = Math.min(Math.min(b, a), n);
       int twice = Math.min(l, o);
       return Math.min(once, twice);
    }
}