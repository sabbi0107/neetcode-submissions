class MyHashMap {

    ListNode[] map;

    public static class ListNode{
        int key;
        int val;
        ListNode next;

        ListNode(int key,int val){
            this.key=key;
            this.val=val;
        }
    }

    public MyHashMap() {
        map = new ListNode[10000];
        for(int i=0;i<map.length;i++){
            map[i]=new ListNode(0,0);
        }
    }
    
    public void put(int key, int value) {
        ListNode cur=map[key%map.length];
        while(cur.next!=null){
            if(cur.next.key==key){
                cur.next.val=value;
                return;
            }
            cur=cur.next;
        }
        cur.next=new ListNode(key,value);
    }
    
    public int get(int key) {
        ListNode cur=map[key%map.length];
        while(cur.next!=null){
            if(cur.next.key==key){
                return cur.next.val;
            }
            cur=cur.next;
        }
        return -1;
    }
    
    public void remove(int key) {
        ListNode cur=map[key%map.length];
        while(cur.next!=null){
            if(cur.next.key==key){
                cur.next=cur.next.next;
                return;
            }
            cur=cur.next;
        }
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */