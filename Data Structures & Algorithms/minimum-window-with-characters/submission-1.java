class Solution {
    public String minWindow(String s, String t) {
        if(s.length()==0 || t.length()==0 ||s.length()<t.length()){
            return "";
        }
        HashMap<Character,Integer> freqCount = new HashMap<>();
        for(char c:t.toCharArray()){
            freqCount.put(c,freqCount.getOrDefault(c,0)+1);
        }
        int count=freqCount.size();
        int right=0,left=0;
        int start=0;
        int minLength = Integer.MAX_VALUE;
        while(right<s.length()){
            char ch = s.charAt(right);
            if(freqCount.containsKey(ch)){
                freqCount.put(ch,freqCount.get(ch)-1);
                if(freqCount.get(ch)==0){
                    count--;
                }
            }

            while(count==0){
                if(right-left+1<minLength){
                    minLength=right-left+1;
                }
                start = left;
                char c = s.charAt(left);
                 if(freqCount.containsKey(c)){
                    freqCount.put(c,freqCount.get(c)+1);
                    if(freqCount.get(c)>0){
                        count++;
                    }
                 }
                 left++;
            }
            right++;
            
        }   
        return minLength==Integer.MAX_VALUE? "": s.substring(start,start+minLength);
    }
}
