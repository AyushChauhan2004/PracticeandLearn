class Solution {
    public int maxProduct(int[] nums) {
        int product = nums[0];
        int maxp = nums[0];
        int minp = nums[0];
        for(int i = 1; i < nums.length;i++){
            int tempmax  = Math.max(nums[i],Math.max(nums[i]* maxp,(nums[i]* minp)));
            int tempmin = Math.min(nums[i],Math.min(nums[i]* maxp,(nums[i]* minp)));
            maxp = tempmax;
            minp = tempmin;
            product = Math.max(product,maxp);
        }
        return product;
    }
}