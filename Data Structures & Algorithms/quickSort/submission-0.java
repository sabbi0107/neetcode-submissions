// Definition for a pair.
// class Pair {
//     int key;
//     String value;
//
//     public Pair(int key, String value) {
//         this.key = key;
//         this.value = value;
//     }
// }
class Solution {
    public List<Pair> quickSort(List<Pair> pairs) {
        qs(pairs,0,pairs.size()-1);
        return pairs;
    }

    void qs(List<Pair> pairs, int L,int R){
        if(L>=R){
            return;
        }
        int partition=partition(pairs,L,R);
        qs(pairs,L,partition-1);
        qs(pairs,partition+1,R);
    }

    int partition(List<Pair> pairs, int L,int R){
        int pivot=R;
        int i=L;
        for(int j=L;j<R;j++){
            if(pairs.get(j).key<pairs.get(pivot).key){
                swap(pairs,i,j);
                i++;
            }
        }
        swap(pairs,i,pivot);
        return i;
    }

    void swap(List<Pair> pairs, int L,int R){
        Pair temp=pairs.get(L);
        pairs.set(L,pairs.get(R));
        pairs.set(R,temp);
    }
}
