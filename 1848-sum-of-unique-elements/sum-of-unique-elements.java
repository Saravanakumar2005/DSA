class Solution {
    public int sumOfUnique(int[] nums) {
        int n = nums.length;
        int out=0;
        Map<Integer,Integer> mp = new HashMap<>();
        for(int i=0;i<n;i++){
            mp.put(nums[i],mp.getOrDefault(nums[i],0)+1);
        }

        for(Map.Entry<Integer,Integer> ans:mp.entrySet()){
            if(ans.getValue()==1){
                 out+=ans.getKey();
            }
        }

        return out;

        
    }
}