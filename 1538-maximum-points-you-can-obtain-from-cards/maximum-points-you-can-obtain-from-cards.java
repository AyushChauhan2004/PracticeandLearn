class Solution {
    public int maxScore(int[] nums, int k) {
        int total = Arrays.stream(nums).sum();
        int wsum = 0;
        int msum = Integer.MAX_VALUE;
        int l = 0;
        int n = nums.length;
        if(n == k ){
            return total;
        }
       for(int i = 0 ; i < nums.length;i++){
        wsum += nums[i];
        if( i - l + 1 == n - k){
            msum = Math.min(wsum,msum);
            wsum -= nums[l];
            l++;
        }
       }
       return total-msum;
    }
}