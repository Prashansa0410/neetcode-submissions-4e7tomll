class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> anagrams = new HashMap<>();

        for(String str:strs){
            int[] count = new int[26];
            for(char ch: str.toCharArray()){
                count[ch-'a']++;
            }
            String pattern = Arrays.toString(count);
            anagrams.putIfAbsent(pattern, new ArrayList<>());
            anagrams.get(pattern).add(str);
        }
        return new ArrayList<>(anagrams.values());
        
    }
}
