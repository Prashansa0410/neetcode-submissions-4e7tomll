class Solution {
    public String minWindow(String s, String t) {
        if(s.length()==0 || t.length()==0 || s.length()<t.length()){
            return "";
        }
        Map<Character,Integer> map = new HashMap<>();
        for(char ch:t.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        int count = map.size();
        int start=0;
        int i=0,j=0,minLength=Integer.MAX_VALUE;
        while(j<s.length()){
         char ch = s.charAt(j);
         if(map.containsKey(ch)){
            map.put(ch,map.get(ch)-1);
            if(map.get(ch)==0){
                count--;
            }
         }
         while(count==0){
            if(j-i+1<minLength){
                minLength=j-i+1;
                start = i;
            }

            char c= s.charAt(i);
            if(map.containsKey(c)){
                map.put(c,map.get(c)+1);
                if(map.get(c)==1){
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
