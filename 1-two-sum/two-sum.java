class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> h1 = new HashMap<>();
        for(int i =0;i<nums.length;i++){
            h1.put(nums[i],i);
        }

        for(int i=0;i<nums.length;i++){
            int n = target - nums[i];
            if(h1.containsKey(n)&&h1.get(n)!=i)
                return new int[]{i,h1.get(n)};
        }
        return new int[]{};
    }
}