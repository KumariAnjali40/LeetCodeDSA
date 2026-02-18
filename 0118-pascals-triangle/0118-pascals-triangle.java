class Solution {
    public List<List<Integer>> generate(int numRows) {

        List<List<Integer>> list = new ArrayList<>();
        
        for(int i = 0; i < numRows; i++){
            
            List<Integer> row = new ArrayList<>();
            int number = 1;

            for(int j = 0; j <= i; j++){
                row.add(number);

                number = number * (i-j) / (j+1);
            }

            list.add(row);
        }

        return list;
    }
}