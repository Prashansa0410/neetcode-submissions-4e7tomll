class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
     Map<String,List<String>> freqMap = new HashMap<>();
     for(String str:strs){
        char[] s1 = str.toCharArray();
        Arrays.sort(s1);
        String key = new String(s1);

        if(!freqMap.containsKey(key)){
            freqMap.put(key,new ArrayList<>());
        }
        freqMap.get(key).add(str);
     }
     return new ArrayList<>(freqMap.values());
    }
}
