class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
       Map<String,List<String>> res=new HashMap<>();
       for(String str:strs){
        char[] sorted = str.toCharArray();
        Arrays.sort(sorted);
        String sortedS=new String(sorted);
        List<String> val = res.containsKey(sortedS)?res.get(sortedS):new ArrayList<>();
        val.add(str);
        res.put(sortedS,val);
       }
       return new ArrayList<>(res.values());
    }
}
