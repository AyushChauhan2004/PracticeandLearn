class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        int l = 0;
        long wsum = 0;
        long max = 0;
        Set<Integer> set = new HashSet<>();
        for(int i = 0 ; i < nums.length;i++){
            while(set.contains(nums[i])){
              set.remove(nums[l]);
               wsum -= nums[l];
                l++;
            }

            set.add(nums[i]);
            wsum += nums[i];
            
            if(i - l + 1 == k){
                max = Math.max(wsum ,max);
                 set.remove(nums[l]);
                wsum -= nums[l];
                l++;
            }
        }
        return max == Long.MIN_VALUE ? 0 : max;
    }
}