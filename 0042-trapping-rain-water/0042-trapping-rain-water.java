class Solution {
    public int trap(int[] height) {

       int n = height.length;
       int res = 0;

       int [] prefixSum = new int [n];
       int [] suffixSum = new int [n];

       prefixSum[0] = height[0];
       suffixSum[n-1] = height[n-1];
       

       for(int i = 1; i < n; i++){
         prefixSum[i] = Math.max(height[i], prefixSum[i-1]);
       }

       for(int i = n-2; i >=0; i-- ){
        suffixSum[i] = Math.max(height[i], suffixSum[i+1]);
       }

       for(int i = 0; i < height.length; i++){
         res += Math.min(prefixSum[i],suffixSum[i])-height[i];
       }

       return res;
    }
}