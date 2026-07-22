class Solution {
    public void moveZeroes(int[] nums) {
        int j = 0;
        for(int i = 0; i < nums.length;i++){
            if(nums[i] != 0){
                swap(nums,i,j);
                            j++;
                            }
        }
    }
    public void swap(int[] arr, int l,int r){
        int temp = arr[l];
        arr[l] =arr[r];
        arr[r] = temp;
    }
}