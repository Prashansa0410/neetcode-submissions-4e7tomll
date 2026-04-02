class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> res = new ArrayList<>();
        List<String> ans = new ArrayList<>();
        getAllPartition(s,res,ans);
        return res;
        
    }

    public void getAllPartition(String s, List<List<String>> res,List<String> ans){
        if(s.length()==0){
            res.add(new ArrayList<>(ans));
            return;
        }

        for(int i=0;i<s.length();i++){
            String part = s.substring(0,i+1);
            if(isPallindrome(part)){
                ans.add(part);
                getAllPartition(s.substring(i+1),res,ans);
                ans.remove(ans.size()-1);
            }
        }
    }

    public Boolean isPallindrome(String s){
        String reverse = new StringBuilder(s).reverse().toString();
        return reverse.equals(s);

    }
}
