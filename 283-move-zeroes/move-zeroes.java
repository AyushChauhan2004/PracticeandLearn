class Solution {
    public void moveZeroes(int[] nums) {
    int l = 0;
     for(int i = 0; i < nums.length;i++){
        if(nums[i] != 0){
            swap(nums,l,i);
            l++;
        }
     }
    }
    public void swap(int[] nums,int r,int l ){
        int t = nums[l];
        nums[l] = nums[r];
        nums[r] = t;
    }
}