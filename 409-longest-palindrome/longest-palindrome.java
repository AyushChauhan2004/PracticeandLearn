class Solution {
    public int longestPalindrome(String s) {
     int[] freq = new int[128];
     int odd = 0;
     for(char ch: s.toCharArray()){
        freq[ch]++;
         if(freq[ch] % 2 == 1){
        odd++;
     }else{
        odd--;
     }
     }
    
     if(odd > 1){
        return s.length() - odd + 1;
     }
     return s.length();
    }
}