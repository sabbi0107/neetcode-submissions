class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] copy=new int[nums.length*2];
        for(int i=0;i<copy.length;i++){
            copy[i]=nums[i%(nums.length)];
        }
        return copy;
    }
}