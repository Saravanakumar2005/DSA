import java.util.*;
class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> h1 = new HashMap<>();
        for(int num:nums){
            h1.put(num,h1.getOrDefault(num,0)+1);
        }
        
        PriorityQueue<Integer> p1 =new PriorityQueue<>((a,b)-> h1.get(b)-h1.get(a));
        p1.addAll(h1.keySet());

        return p1.peek();
    }
}