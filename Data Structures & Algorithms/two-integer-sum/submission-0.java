class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map=new HashMap<>(); 
        for(int i=0;i<nums.length;i++){
            int rem=target-nums[i];
            if(map.containsKey(rem)){
                int remIndex = map.get(rem);
                return i>remIndex?new int[]{remIndex,i}:new int[]{i,remIndex};
            }
            map.put(nums[i],i);
        }
        return new int[]{};
    }
}
