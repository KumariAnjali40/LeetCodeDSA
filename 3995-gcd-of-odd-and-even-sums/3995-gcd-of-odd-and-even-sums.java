class Solution {
    public int gcdOfOddEvenSums(int n) {
        int oddNumSum = sumOfOdd(n);
        int evenNumSum = sumOfEven(n);

        int gcd = findGCD(oddNumSum, evenNumSum);

        return gcd;
    }

    public static int sumOfOdd(int n){
       int sum = 0;
       int odd = 1;

       for(int i = 1; i <= n; i++ ){
          sum += odd;
          odd += 2;
       }

       return sum;
    }

    public static int sumOfEven(int n){
       int sum = 0;
       int odd = 2;

       for(int i = 1; i <= n; i++ ){
          sum += odd;
          odd += 2;
       }

       return sum;
    }

    public static int findGCD(int a, int b){

        while(b != 0){
            int temp = b;
            b = a%b;
            a = temp;
        }

        return a;
    }

        
}