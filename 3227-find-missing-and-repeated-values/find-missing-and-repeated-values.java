import java.util.*;
class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n = grid.length;
        HashMap<Integer,Integer> h1 = new HashMap<>();
        for(int i=0;i<n;i++){
            for(int j=0;j<grid[i].length;j++){
                int num = grid[i][j];
                h1.put(num,h1.getOrDefault(num,0)+1);
            }
        }
        int ar[] = new int[2];
        int check = (n*n)*(n*n+1)/2;
        System.out.println(check);
        for(Map.Entry<Integer,Integer> entry :h1.entrySet()){
            if(entry.getValue() > 1)
                ar[0] = entry.getKey();
            check-=entry.getKey();
            
        }
        
        ar[1] = check;

        return ar;
        
    }
}