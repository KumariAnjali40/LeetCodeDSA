class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int n = triangle.size();

        // for(int i = n-2; i >=0; i--){
        //     for(int j = 0; j < triangle.get(i).size(); j++){
        //         int curr = triangle.get(i).get(j);

        //         int leftVal = triangle.get(i+1).get(j);
        //         int rightVal = triangle.get(i+1).get(j+1);

        //         int newVal = curr + Math.min(leftVal, rightVal);

        //         triangle.get(i).set(j, newVal);


        //     }
        // }

        for(int i = n-2; i >=0 ; i--){
            for (int j = 0; j < triangle.get(i).size(); j++){
                int curr = triangle.get(i).get(j);

                int leftVal = triangle.get(i+1).get(j);
                int rightVal = triangle.get(i+1).get(j+1);

                int newVal = curr + Math.min(leftVal, rightVal);

                triangle.get(i).set(j, newVal);

                
            }
        }

        return triangle.get(0).get(0);
    }
}