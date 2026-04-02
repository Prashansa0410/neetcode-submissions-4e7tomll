class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length()>s2.length()){
            return false;
        }
     HashMap<Character,Integer> map = new HashMap<>();
        for(char c:s1.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        int count = map.size();
        int i=0,j=0;

        while(j<s2.length()){
             char ch =s2.charAt(j);
             if(map.containsKey(ch)){
                map.put(ch,map.get(ch)-1);
                if(map.get(ch)==0){
                    count--;
                }
             }
        
        if(j-i+1<s1.length()){
            j++;
        }

        else if(j-i+1==s1.length()){
            if(count==0){
                return true;
            }
            char c1 = s2.charAt(i);
            if(map.containsKey(c1)){
                map.put(c1,map.get(c1)+1);
                if(map.get(c1)==1){
                    count++;
                }
            }
               i++;j++;
        }
     
        }
      return false; 
    
    }
    
}
