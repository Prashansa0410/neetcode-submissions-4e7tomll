class Solution {
    public boolean isAnagram(String s, String t) {
        int arr[] = new int[26];
        int arr1[] = new int[26];

        for(int i=0 ; i<s.length();i++){
            arr[s.charAt(i)-'a']++;
            
        }
        for(int j=0;j<t.length();j++){
            arr1[t.charAt(j)-'a']++;
        }
        if(Arrays.equals(arr,arr1)){
        return true;
    }
    return false;
    }
}
