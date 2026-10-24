class Solution {
    public boolean hasDuplicate(int[] nums) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int num:nums){
            map.put(num,map.containsKey(num)?map.get(num)+1:1);
        }
        for(int num:nums){
            if(map.get(num)>1){
                return true;
            }
        }
        return false;
    }
}