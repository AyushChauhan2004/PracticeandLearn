class Solution {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
 int l = nums.length;
        int max1 = nums[0] * nums[1] * nums[l - 1];
        int max2 = nums[l - 3] * nums[l - 2] * nums[l - 1];

        return Math.max(max1, max2);
    }
}