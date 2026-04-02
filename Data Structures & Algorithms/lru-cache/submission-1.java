class LRUCache {

    class Node{
        Node prev,next;
        int key,value;

        Node(int key,int value){
            this.key=key;
            this.value=value;
            prev=next=null;
        }
    }

    Node head = new Node(-1,-1);
    Node tail = new Node(-1,-1);
    int limit;

    HashMap<Integer,Node> map = new HashMap<>();


    public LRUCache(int capacity) {
        limit = capacity;
        head.next=tail;
        tail.prev=head;
    }

    
    public int get(int key) {
        if(!map.containsKey(key)){
            return -1;
        }
        Node node = map.get(key);
        deleteNode(node);
        addNode(node);
        return node.value;
    }
    
    public void put(int key, int value) {
        if(map.containsKey(key)){
           Node oldNode= map.get(key);
           deleteNode(oldNode);
           map.remove(key);  
        }
        if(limit==map.size()){
            map.remove(tail.prev.key);
            deleteNode(tail.prev);
        }
        Node newNode = new Node(key,value);
        addNode(newNode);
        map.put(key,newNode);
    }

    public void addNode(Node newNode){
        Node oldNext = head.next;
        head.next = newNode;
        newNode.next=oldNext;
        oldNext.prev = newNode;
        newNode.prev=head;
    }

    public void deleteNode(Node oldNode){
        Node oldPrev = oldNode.prev;
        Node oldNext=oldNode.next;
        oldPrev.next=oldNext;
        oldNext.prev=oldPrev;
    }
}
