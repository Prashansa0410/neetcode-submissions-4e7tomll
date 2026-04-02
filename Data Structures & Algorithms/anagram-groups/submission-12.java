class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
     Map<String,List<String>> grp = new HashMap<>();
     for(String str:strs){
        char[] c = str.toCharArray();
        Arrays.sort(c);
        String key = new String(c);
        if(!grp.containsKey(key)){
            grp.put(key,new ArrayList<>());
        }
        grp.get(key).add(str);
     }
     return new ArrayList<>(grp.values());
    }
}
