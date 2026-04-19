class Solution {
    public String minWindow(String s, String t) {
        HashMap<Character,Integer> map = new HashMap<Character,Integer>();

        //put all characters from string t to map
        for(Character c: t.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        int i=0,j=0;
        int start=0;
        int count=map.size();
        int minLength=Integer.MAX_VALUE;
        //using i for shrinking the window and j for expanding the window
        //j add characters and i mimimize the window size based on the valid condition

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
                    start=i;
                }
                
                //now shrink the window until valid

                char ch1=s.charAt(i);
                if(map.containsKey(ch1)){
                    map.put(ch1,map.get(ch1)+1);
                    if(map.get(ch1)>0){
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
