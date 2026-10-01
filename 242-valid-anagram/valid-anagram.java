class Solution {
    public boolean isAnagram(String s, String t) {
        int []freq = new int[26];
        for(char c : s.toCharArray()){
            freq[c - 'a']++;
        }
        int []freq1 = new int[26];
        for(char c : t.toCharArray()){
            freq1[c - 'a']++;
        }
        return Arrays.equals(freq,freq1);
    }
}

// HashMap
// class Solution {
//     public boolean isAnagram(String s, String t) {
//         HashMap<Character,Integer> map = new HashMap<>();
//         for(char c : s.toCharArray()){
//             map.put(c,map.getOrDefault(c,0) + 1);
//         }
//         HashMap<Character,Integer> map1 = new HashMap<>();
//         for(char c : t.toCharArray()){
//             map1.put(c,map1.getOrDefault(c,0) + 1);
//         }
//         return map.equals(map1);
//     }
// }