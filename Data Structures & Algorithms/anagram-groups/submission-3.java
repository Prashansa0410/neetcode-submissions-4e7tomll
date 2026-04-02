class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> keyValue = new HashMap<>();
        for(String str: strs){
            char[] strChar = str.toCharArray();
            Arrays.sort(strChar);
            String key = new String(strChar);

            if(!keyValue.containsKey(key)){
                keyValue.put(key,new ArrayList<>());
            }
            keyValue.get(key).add(str);
        }

        return new ArrayList<>(keyValue.values());
    }
}
