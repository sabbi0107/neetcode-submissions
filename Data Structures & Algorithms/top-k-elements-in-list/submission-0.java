class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> freq=new HashMap<>();
        for(int num:nums){
            freq.put(num,freq.getOrDefault(num,0)+1);
        }
        List<Integer>[] arr=new List[nums.length+1];
        for(int i=0;i<arr.length;i++){
            arr[i]=new ArrayList<>();
        }
        for(Map.Entry<Integer,Integer> entry:freq.entrySet()){
            arr[entry.getValue()].add(entry.getKey());
        }
        int[] res=new int[k];
        int count=0;
        for(int i=arr.length-1;i>0;i--){
            for(int num:arr[i]){
                res[count++]=num;
                if(count==k){
                    return res;
                }
            }
        }
        return res;
    }
}
