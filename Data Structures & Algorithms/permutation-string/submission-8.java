class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int i=0,j=0;
        if(s1.length()>s2.length()){
            return false;
        }

        Map<Character,Integer> map = new HashMap<>();

        for(char ch: s1.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        int count=map.size();

        while(j<s2.length()){
            char c= s2.charAt(j);
            if(map.containsKey(c)){
                map.put(c,map.get(c)-1);
                if(map.get(c)==0){
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

                //slide the window
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
