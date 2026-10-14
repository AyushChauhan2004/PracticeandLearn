class Solution {
    public int maxScore(int[] card, int k) {
        int n = card.length;
        int l = 0;
        int wsum = 0;
        int min1 = Integer.MAX_VALUE;
        int total = Arrays.stream(card).sum();
        if(n == k){
            return total;
        }
        for(int i = 0; i < card.length;i++){
            wsum += card[i];
            if(i - l + 1 == n - k){
                min1 = Math.min(min1,wsum);
                wsum -= card[l];
                l++;
            }
        }
        return total - min1;
    }
}