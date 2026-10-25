class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> res=new HashMap<>();
       for(String str:strs){
        char[] charArray = str.toCharArray();
        int[] count = new int[26];
        for(char c:charArray){
            count[c-'a']++;
        }
        String key = Arrays.toString(count);
        List<String> val=res.containsKey(key)?res.get(key):new ArrayList<>();
        val.add(str);
        res.put(key,val);
       }
       return new ArrayList<>(res.values());
    }
}
