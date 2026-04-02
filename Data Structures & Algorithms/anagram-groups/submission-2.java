class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        Map<String,List<String>> grpAnangram = new HashMap();

        for(String str: strs){
            int charArrayCount[] = new int[26];
            for(char c:str.toCharArray()){
            charArrayCount[c-'a']++;
            }
            StringBuilder keyBuilder = new StringBuilder();
            String key = new String();
            for(int count: charArrayCount){
             key = keyBuilder.append("#").append(count).toString();
            }
            if(!grpAnangram.containsKey(key)){
                grpAnangram.put(key,new ArrayList());
            }
            grpAnangram.get(key).add(str);

        }
        return new ArrayList<>(grpAnangram.values());
       
    }
}

