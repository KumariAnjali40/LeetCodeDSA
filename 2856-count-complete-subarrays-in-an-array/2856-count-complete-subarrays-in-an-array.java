import java.util.*;

class Solution {
    public int countCompleteSubarrays(int[] nums) {
        HashSet<Integer> mainSet = new HashSet<>();
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            mainSet.add(num);
        }

        int n = nums.length;
        int left = 0; 
        int right = 0;
        int count = 0;

        while (right < n) {
            map.put(nums[right], map.getOrDefault(nums[right], 0) + 1);

            while (map.size() == mainSet.size()) {
                count += (n - right);

                int leftNum = nums[left];
                map.put(leftNum, map.get(leftNum) - 1);
                if (map.get(leftNum) == 0) {
                    map.remove(leftNum);
                }
                left++;
            }

            right++;
        }

        return count;
    }
}
