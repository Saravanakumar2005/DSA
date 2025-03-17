class Solution {
    public int strStr(String haystack, String needle) {
        int n = needle.length();
        int w = haystack.length();
       
        if(n<=1&&w<=1)
            return 0;
        if(n>w)
            return -1;
        
        for(int i=0;i<=w-n;i++){
            if(haystack.substring(i,i+n).equals(needle))
                return i;
        }
      
        return -1;
    }
}