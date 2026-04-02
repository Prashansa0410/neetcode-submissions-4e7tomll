class LRUCache {

   class Node{
    int key,value;
    Node prev,next;

    Node(int key,int value){
        this.key=key;
        this.value=value;
        prev=next=null;
    }
   }

    Node head = new Node(-1,-1);
    Node tail = new Node(-1,-1);
    int limit;
    Map<Integer,Node> map = new HashMap<>();

    public LRUCache(int capacity) {
    limit = capacity;
    head.next=tail;
    tail.prev=head;
    }

    
    public int get(int key) {
        if(!map.containsKey(key)){
            return -1;
        }

        Node MRU = map.get(key);
        deleteNode(MRU);
        addNode(MRU);
        return MRU.value;
       
    }
    
    public void put(int key, int value) {
        if(map.containsKey(key)){
            Node node = map.get(key);
            deleteNode(node);
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

    public void addNode(Node node){
        Node oldNext = head.next;
        node.next= oldNext;
        head.next=node;
        oldNext.prev=node;
        node.prev=head;
    }

    public void deleteNode(Node node){
        Node prevNode = node.prev;
        Node nextNode = node.next;
        prevNode.next=nextNode;
        nextNode.prev=prevNode;
    }

   

   
}
