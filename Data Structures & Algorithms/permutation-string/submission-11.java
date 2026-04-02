class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length()>s2.length()){
            return false;
        }

        HashMap<Character,Integer> map = new HashMap<>();
        for(char ch:s1.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        int count = map.size();

        int j=0,i=0;
        while(j<s2.length()){
            char ch = s2.charAt(j);
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

                //slide the window
                char c = s2.charAt(i);
                if(map.containsKey(c)){
                    map.put(c,map.get(c)+1);
                    if(map.get(c)==1){
                        count++;
                    }
                }
                i++;j++;
            }
        }
        return false;

    }
    
}
