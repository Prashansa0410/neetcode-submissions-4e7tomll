class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
     Map<String,List<String>> freqMap = new HashMap<>();
     for(String str:strs){
        char[] ch = str.toCharArray();
        Arrays.sort(ch);
        String key = new String(ch);
        if(!freqMap.containsKey(key)){
            freqMap.put(key,new ArrayList<>());
        }
        freqMap.get(key).add(str);
     }
     return new ArrayList<>(freqMap.values());
    }
}
