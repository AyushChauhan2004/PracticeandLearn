class Solution {
    public double findMaxAverage(int[] nums, int k) {

        int l = 0;
        int sum = 0;
        int ans = Integer.MIN_VALUE;

        for(int r = 0; r < nums.length;r++){
            sum += nums[r];

            if(r - l + 1 > k){
                sum -= nums[l];
                l++;
            }

            if(r - l + 1 == k){
                ans = Math.max(ans,sum);
            }
        }
        return (double) ans / k;
    }
}