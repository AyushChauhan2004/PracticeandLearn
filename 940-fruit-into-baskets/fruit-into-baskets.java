class Solution {
    public int totalFruit(int[] fruits) {
        Map<Integer,Integer> map = new HashMap<>();
        int maxlen = 0;
        int l = 0;
        for(int r = 0; r < fruits.length;r++){
            map.put(fruits[r],map.getOrDefault(fruits[r],0) + 1);
            while(map.size() > 2){
                int out = fruits[l];
                map.put(out,map.get(out) - 1);
            if(map.get(out) == 0){
                map.remove(out);
            }
             l++;
            }
maxlen = Math.max(maxlen,r - l + 1);
        }
        return maxlen;
}
}











//TLE USING SET 
    //     // int l = 0;
    //     // int maxlen = 0;
    //     // Set<Integer> set = new HashSet<>();
    //     // for(int r = 0; r < fruits.length;r++){
    //     //      set.add(fruits[r]);
    //     //     while(set.size() > 2){
    //     //         int out = fruits[l];
    //     //         l++;
    //     //         if(findIndex(fruits, out,l,r) == -1){
    //     //             set.remove(out);
    //     //         }
    //     //     }
    //     //     maxlen = Math.max(maxlen, r - l + 1);
    //     // }
    //     // return maxlen;
    // }
    // // public int findIndex(int[] arr, int target,int l , int r){
    // //     for(int i = l; i <=r;i++){
    // //         if(arr[i] == target){
    // //             return i;
    // //         }
    // //     }
    // //     return -1;
    // // }