class Solution {

    public String encode(List<String> strs) {
       StringBuilder build = new StringBuilder();
        for(String str:strs){
        int n = str.length();
        build.append(n).append("#").append(str);
        }
        return build.toString();
    
    }

    public List<String> decode(String str) {
        List<String> res = new ArrayList<>();
        int i=0;
        while(i!=str.length()){
            int j=i;
            while(str.charAt(j)!='#'){
                j++;
            }
            int length = Integer.parseInt(str.substring(i,j));
            i=j+1;
            j=i+length;
            res.add(str.substring(i,j));
            i=j;
        }

        
        return res;



    }
}
