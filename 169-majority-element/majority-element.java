class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        int vote = 0;
        int cand = 0;
        for(int i = 0; i < nums.length;i++){
            if(vote == 0){
                cand = nums[i];
                vote++;
            }else if(nums[i] == cand){
                vote++;
            }else{
                vote--;
            }
        }
        int count1 = 0;
        for(int i = 0; i < nums.length;i++){
            if(nums[i] == cand){
              count1++;  
            }
        }
        if(count1 > n/2){
            return cand;
        }
        return -1;
    }
}