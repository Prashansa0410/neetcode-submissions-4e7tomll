class Solution {
    public String minWindow(String s, String t) {
       Map<Character,Integer> map = new HashMap<>();
       

       for(char ch: t.toCharArray()){
        map.put(ch,map.getOrDefault(ch,0)+1);
       } 
       int count = map.size();
       int i=0,j=0;
       int minlength=Integer.MAX_VALUE;
       int start=0;
       while(j<s.length()){
        char c = s.charAt(j);
        if(map.containsKey(c)){
            map.put(c,map.get(c)-1);
            if(map.get(c)==0){
            count--;
        }
        }

        

        while(count==0){
            if(j-i+1<minlength){
                minlength = j-i+1;
                start=i;
            }
            char left = s.charAt(i);
            if(map.containsKey(left)){
                map.put(left,map.get(left)+1);
                if(map.get(left)>0){
                count++;
            }
            }

            
            i++;       
        }
        j++;


       }
       return minlength == Integer.MAX_VALUE?"":s.substring(start,start+minlength);

        
    }
}
