class Solution {
    public List<String> generateParenthesis(int n) {

        List<String> ans = new ArrayList<>();
        int close = n;
        int open =n;
        String output ="";     
          parenthesis(open,close,output,ans);
          return ans;
    }

    public void parenthesis(int open,int close, String output, List<String> ans){

        if(close==0 && open==0){
            ans.add(new String(output));
            return;
        }

        if(open!=0){
            StringBuilder output1 = new StringBuilder(output);
            output1.append('(');
            parenthesis(open-1,close,output1.toString(),ans);
        }

        if(open<close){
            StringBuilder output1 = new StringBuilder(output);
            output1.append(')');
            parenthesis(open,close-1,output1.toString(),ans);
        }
        
    }
}
