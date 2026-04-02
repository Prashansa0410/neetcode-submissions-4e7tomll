class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        HashMap<String,List<String>> map = new HashMap<>();
        
        for(String str: strs){
            char[] ch = str.toCharArray();
            int[] count = new int[26];
            for(char c:ch){
                count[c-'a']++;
            }
            String key = Arrays.toString(count);

            map.putIfAbsent(key,new ArrayList<>());
            map.get(key).add(str);
        }
        return new ArrayList<>(map.values());
    }
}
