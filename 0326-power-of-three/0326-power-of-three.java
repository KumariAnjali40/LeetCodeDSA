class Solution {
    public boolean isPowerOfThree(int n) {
         boolean isMultipleOfThree = false;

        //  if(n==0){
        //     return false;
        //  }

        //  while(n>0 && n%3 ==0 ){
        //       n = n/3;
        //  }

        //  if(n == 1){
        //     return true;
        //  }

        //  return false;

        if(n <= 0){
            return false;
        }

        if(n == 1){
            return true;
        }

        return n%3 == 0 && isPowerOfThree(n/3);



         
    }
}