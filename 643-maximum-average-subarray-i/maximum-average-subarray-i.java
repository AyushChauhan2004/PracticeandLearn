class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int i = 0, j = 0;
        long sum = 0;
        long maxSum = Long.MIN_VALUE;
        while (j < nums.length) {
            sum += nums[j];
            if (j - i + 1 < k) {
                j++;
            } else if (j - i + 1 == k) {
                if (sum > maxSum) maxSum = sum;
                sum -= nums[i];
                i++;
                j++;
            }
        }
        return maxSum / (double) k;
    }
}