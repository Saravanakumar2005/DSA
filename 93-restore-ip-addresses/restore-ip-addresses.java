class Solution {
    private void solver(String s,int i,List<String> ans,List<String> temp){
        
        if(temp.size()==4 && i==s.length()){
           ans.add(String.join(".", temp));
          
        }

        // if((temp.size()==4))  return ;

        for(int j=1;j<=3;j++){
            if(i+j >s.length()) break;
            String seg = s.substring(i,i+j); 

            if(seg.charAt(0) =='0'&&seg.length()>1) break;
            if(Integer.parseInt(seg)>255) break;

            temp.add(seg);
            solver(s,i+j,ans,temp);
            temp.remove(temp.size()-1);
        }
    }
    public List<String> restoreIpAddresses(String s) {
        int n = s.length();
        List<String> ans = new ArrayList<>();
        List<String> temp = new ArrayList<>();
        
        if(n>12) return ans;
        if(n<4) return ans;
        solver(s,0,ans,temp);
        return ans;
    }
}