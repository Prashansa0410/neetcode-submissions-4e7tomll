class Solution {
    public String minWindow(String s, String t) {
        HashMap<Character,Integer> map = new HashMap<>();
        for(char ch: t.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        int count=map.size();
        int minLength = Integer.MAX_VALUE;
        int i=0,start=0,j=0;
        while(j<s.length()){
            char c=s.charAt(j);
            if(map.containsKey(c)){
                map.put(c,map.get(c)-1);
                if(map.get(c)==0){
                    count--;
                }
            }

            //get the answer from her
            while(count==0){
                if(j-i+1<minLength){
                    minLength=j-i+1;
                    start=i;
                }

                //slide the window to get the minimum length substring
                 
                 char leftChar = s.charAt(i);
                 if(map.containsKey(leftChar)){
                    map.put(leftChar,map.get(leftChar)+1);
                    if(map.get(leftChar)>0){
                        count++;
                    }
                 }
                 i++;
            }
            j++;
        }

        return minLength==Integer.MAX_VALUE?"":s.substring(start,start+minLength);
        
    }
}
