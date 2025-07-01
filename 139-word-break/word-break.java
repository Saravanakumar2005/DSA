import java.util.*;

class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
       
        Set<String> wordSet = new HashSet<>(wordDict);

      
        boolean[] dp = new boolean[s.length() + 1];
        dp[0] = true; 

        for (int i = 1; i <= s.length(); i++) {
            for (int j = 0; j < i; j++) {
                
                if (dp[j] && wordSet.contains(s.substring(j, i))) {
                    dp[i] = true;
                    break;
                }
            }
        }

        return dp[s.length()];
    }
}

public class Main {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        String s = scn.next();
        int n = scn.nextInt();
        List<String> wordDict = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String st = scn.next();
            wordDict.add(st);
        }

        Solution sol = new Solution();
        boolean ans = sol.wordBreak(s, wordDict);

        if (ans) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}