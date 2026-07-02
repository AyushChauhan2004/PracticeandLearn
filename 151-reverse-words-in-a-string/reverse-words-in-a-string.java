class Solution {
    public String reverseWords(String s) {
        StringBuilder str1 = new StringBuilder();
        String[] words = s.split(" ");
        for(int i = words.length - 1; i >=0 ; i--){
            if(!words[i].equals("")){
                str1.append(words[i]).append(" ");
            }
        }
        return str1.toString().strip();
    }
}