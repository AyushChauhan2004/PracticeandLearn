class Solution {
    public int maxArea(int[] height) {
int l = 0;
int r = height.length - 1;
int currentmax = 0;
while(l < r){
int width = r - l;
int h = Math.min(height[l],height[r]);
int maxarea = width * h;
 currentmax = Math.max(currentmax,maxarea);

if(height[l] > height[r]){
    r--;
}else{
    l++;
}
}
return currentmax;
    }
}