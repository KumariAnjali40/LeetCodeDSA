class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int [] res = findNexGre(nums2); // [3, 4, -1, -1]

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < nums2.length; i++){
            map.put(nums2[i], res[i]);
        }

        int [] ans = new int [nums1.length];

        for(int i = 0; i < nums1.length; i++){
           if(map.containsKey(nums1[i])){
            ans[i] = map.get(nums1[i]);
           }
        }

        return ans;
    }


    public static int [] findNexGre(int [] arr){
        Stack<Integer> st = new Stack<>();

        int [] res = new int [arr.length];

        for(int i = arr.length - 1; i >= 0; i--){
            while(!st.isEmpty() && arr[i] >= st.peek()){
                st.pop();
            }

            if(st.isEmpty()){
                res[i] = -1;
            } else {
               res[i] = st.peek();
            }

            st.push(arr[i]);
        }

        return res;
    }
}