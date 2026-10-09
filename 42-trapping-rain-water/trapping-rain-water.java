class Solution {
    public int trap(int[] h) {
        int l = 0;
        int r = h.length - 1;
        
        int lmax = 0;
        int rmax = 0;

        int w = 0;
        while(l < r){
            if (h[l] >= h[r]){
                if(h[r] >= rmax){
                    rmax = h[r];
                }else{
                    w += rmax - h[r];
                }
                r--;
            }else{
                if(h[l] >= lmax){
                    lmax = h[l];
                }else{
                    w += lmax - h[l];
                }
                l++;
            }
        }
        return w;
    }
}