class Solution {
    public int[] twoSum(int[] num, int tar) {
        int l = 0;
        int r = num.length - 1;
        while(l <r){
            if(num[l] + num[r] == tar){
                return new int[]{l + 1,r + 1};
            }else if(num[l] + num[r] > tar){
                r--;
            }else{
                l++;
            } 
        }
        return new int[]{};
    }
}