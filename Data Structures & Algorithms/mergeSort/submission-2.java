// Definition for a pair.
// class Pair {
//     public int key;
//     public String value;
//
//     public Pair(int key, String value) {
//         this.key = key;
//         this.value = value;
//     }
// }
class Solution {
    public List<Pair> mergeSort(List<Pair> pairs) {
        ms(pairs,0,pairs.size()-1);
        return pairs;
    }

    void ms(List<Pair> pairs, int L, int R){
        if(L>=R){
            return;
        }
        int mid=(L+R)/2;
        ms(pairs,L,mid);
        ms(pairs,mid+1,R);
        merge(pairs, L,mid,R);
    }

    void merge(List<Pair> pairs, int L, int mid, int R){
        int i=L,j=mid+1;
        List<Pair> temp=new ArrayList<>();
        while(i<=mid && j<=R){
            if(pairs.get(i).key<=pairs.get(j).key){
                temp.add(pairs.get(i));
                i++;
            }
            else{
                temp.add(pairs.get(j));
                j++;
            }
        }
        while(i<=mid){
            temp.add(pairs.get(i));
            i++;
        }
        while(j<=R){
            temp.add(pairs.get(j));
            j++;
        }
        for(int k=L;k<j;k++){
            pairs.set(k,temp.get(k-L));
        }
    }
}
