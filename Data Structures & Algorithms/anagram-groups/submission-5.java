class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
       Map<String,List<String>> grp = new HashMap<>();
       for(String str:strs){
        char[] ch = str.toCharArray();
        Arrays.sort(ch);
        String key = new String(ch);
        if(!grp.containsKey(key)){
            grp.put(key,new ArrayList<>());
        }
        grp.get(key).add(str);
       }
       return new ArrayList<>(grp.values());
    }
}
