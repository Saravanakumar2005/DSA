class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n1 = nums2.length;
        Stack<Integer> st = new Stack<>();
        Map<Integer,Integer> map = new HashMap<>();
        int ans[] = new int[nums1.length];

        for(int i=n1-1;i>=0;i--){
            int element = nums2[i];

            while(!st.isEmpty()&&st.peek()<=element){
                st.pop();
            }

            if(st.isEmpty()){
                map.put(element,-1);
            }
            else
                map.put(element,st.peek());
            st.push(element);
        }

        for(int i=0;i<nums1.length;i++){
            ans[i] = map.get(nums1[i]);
        }
       return ans;
    }
}