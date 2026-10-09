class Solution {
    public int maxArea(int[] height) {
        int l = 0;
        int r = height.length - 1;
        int maxarea = 0;
        while(l < r){
            int w = r - l;
            int h = Math.min(height[l],height[r]);
            int currarea = w * h;
            maxarea = Math.max(currarea,maxarea);

            if(height[r] > height[l]){
                l++;
            }else{
                r--;
            }
        }
        return maxarea;
    }
}