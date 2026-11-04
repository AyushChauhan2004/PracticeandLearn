class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> map = new  HashMap<>();
        int prefix = 0;
        int maxlen = 0;
        map.put(0,-1);
        for(int i = 0;i < nums.length;i++){
            prefix += nums[i];
            int mod = prefix % k;
            if(map.containsKey(mod)){
                int len = i - map.get(mod);
                maxlen = Math.max(len,maxlen);
            }else{
                map.put(mod,i);
            }
        }
        if(maxlen >= 2){
            return true;
        }else{
            return false;
        }
    }
}