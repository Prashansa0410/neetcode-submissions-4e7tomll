class Solution {
    public String minWindow(String s, String t) {
        HashMap<Character,Integer> tmap = new HashMap<>();
        HashMap<Character,Integer> smap = new HashMap<>();
        int minLength=Integer.MAX_VALUE;

        int have=0,need=0;
        int j=0,i=0;
        int start=0;

        for(char ch:t.toCharArray()){
            tmap.put(ch,tmap.getOrDefault(ch,0)+1);
        }
        need=tmap.size();

        while(j<s.length()){

            if(tmap.containsKey(s.charAt(j))){
                smap.put(s.charAt(j),smap.getOrDefault(s.charAt(j),0)+1);
                if(smap.get(s.charAt(j))==tmap.get(s.charAt(j))){
                    have=have+1;
                }
            }

            while(have==need){
                if(j-i+1<minLength){
                minLength=j-i+1;
                start=i;
            }
            char ch1=s.charAt(i);
            if(tmap.containsKey(ch1)){
                smap.put(ch1,smap.get(ch1)-1);
                if(smap.get(ch1)<tmap.get(ch1)){
                    have=have-1;
                }
            } 
            i++;    
            }
            j++;
        }
        return minLength==Integer.MAX_VALUE?"":s.substring(start,start+minLength);
        
    }
}
