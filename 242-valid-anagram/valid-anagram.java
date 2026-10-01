class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character,Integer> map = new HashMap<>();
        for(char c : s.toCharArray()){
            map.put(c,map.getOrDefault(c,0) + 1);
        }
        HashMap<Character,Integer> map1 = new HashMap<>();
        for(char c : t.toCharArray()){
            map1.put(c,map1.getOrDefault(c,0) + 1);
        }
        return map.equals(map1);
    }
}