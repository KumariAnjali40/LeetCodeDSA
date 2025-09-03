class Solution {
    public boolean canCross(int[] stones) {
        int n = stones.length;
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < n; i++){
            map.put(stones[i], i);
        }
        if(!map.containsKey(1)) return false;

        // Memoization: key = index + "-" + prevJump
        HashMap<String, Boolean> memo = new HashMap<>();

        return dfs(stones, 1, 1, map, memo);
    }

    private boolean dfs(int[] stones, int index, int prevJump, HashMap<Integer,Integer> map, HashMap<String, Boolean> memo) {
        if(index == stones.length - 1) return true;

        String key = index + "-" + prevJump;
        if(memo.containsKey(key)) return memo.get(key);
        for(int jump = prevJump - 1; jump <= prevJump + 1; jump++) {
            if(jump <= 0) continue; 
            int nextPos = stones[index] + jump;
            if(map.containsKey(nextPos)) {
                int nextIndex = map.get(nextPos);
                if(dfs(stones, nextIndex, jump, map, memo)) {
                    memo.put(key, true);
                    return true;
                }
            }
        }

        memo.put(key, false);
        return false;
    }
}
