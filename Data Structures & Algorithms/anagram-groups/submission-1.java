class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
       Map<String,List<String>> grpAnagram = new HashMap<>();
       for(String str:strs){
        int charArray[] = new int[26];
        for(char c : str.toCharArray()){
            charArray[c-'a']++;
        }
        StringBuilder keyString = new StringBuilder();
        for(int count:charArray)
        keyString.append('#').append(count);
        String key= keyString.toString();
        if(!grpAnagram.containsKey(key)){
            grpAnagram.put(key,new ArrayList());
        }
        grpAnagram.get(key).add(str);
       }
       return new ArrayList<>(grpAnagram.values());
        
    }
}

