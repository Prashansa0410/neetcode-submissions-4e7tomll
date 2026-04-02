class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
       HashMap<String,List<String>> grp = new HashMap<>();
       for(String str:strs){
        int[] count = new int[26];
        for(char ch:str.toCharArray()){
            count[ch-'a']++;
        }
        String pattern = Arrays.toString(count);
        grp.putIfAbsent(pattern,new ArrayList<>());
        grp.get(pattern).add(str);
       }

       return new ArrayList<>(grp.values());
       
    }
}
