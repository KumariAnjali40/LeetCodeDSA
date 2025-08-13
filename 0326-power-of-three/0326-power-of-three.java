class Solution {
    public boolean isPowerOfThree(int n) {
         boolean isMultipleOfThree = false;

         if(n==0){
            return false;
         }

         while(n>0 && n%3 ==0 ){
            
              n = n/3;
         }

         if(n == 1){
            return true;
         }

         return false;

         
    }
}