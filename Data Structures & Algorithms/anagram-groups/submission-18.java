class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> list = new HashMap<>();
        
         for(String str:strs){
            int[] count = new int[26];
            for(char ch:str.toCharArray()){
                count[ch-'a']++;
            }
            String pattern = Arrays.toString(count);
            list.putIfAbsent(pattern,new ArrayList<>());
            list.get(pattern).add(str);
         }
         return new ArrayList<>(list.values());
    }
}
