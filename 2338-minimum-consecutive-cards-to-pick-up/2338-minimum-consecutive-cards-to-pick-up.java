class Solution {
    public int minimumCardPickup(int[] cards) {
        
        HashMap<Integer, Integer> map = new HashMap<>();

        // int left = 0;
        // int right = 0;
        int min = Integer.MAX_VALUE;

        // while(right < cards.length){


        //     while(map.containsKey(cards[right])){
        //         int leftNum = cards[left];

        //         map.put(leftNum, map.get(leftNum) - 1);

        //         if(map.get(leftNum) == 0){
        //             map.remove(leftNum);
        //         }

        //         min = Math.min(min, right-left+1);
                
        //         left++;
                
        //     }

        //     map.put(cards[right], 1);

        //     right++;
        // }

        // return (min == Integer.MAX_VALUE ? -1 : min);

        for(int i = 0; i < cards.length; i++){

            if(map.containsKey(cards[i])){
                min = Math.min(min , i-map.get(cards[i])+1);
            }

            map.put(cards[i], i);
        }

        return (min == Integer.MAX_VALUE ? -1 : min);
    }
}