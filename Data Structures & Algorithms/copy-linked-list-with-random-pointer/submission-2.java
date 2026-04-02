/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        if(head==null){
            return null;
        }
        HashMap<Node,Node> map = new HashMap<>();
        Node node = new Node(head.val);
        map.put(head, node);
        Node newHead = node;
        Node oldtmp = head.next;
        Node newtmp = newHead;
        while(oldtmp!=null){
            Node newNode = new Node(oldtmp.val);
            map.put(oldtmp,newNode);
            newtmp.next=newNode;
            newtmp=newtmp.next;
            oldtmp = oldtmp.next;
        }

        oldtmp=head;
        newtmp=newHead;

        while(oldtmp!=null){
            newtmp.random=map.get(oldtmp.random);
            oldtmp=oldtmp.next;
            newtmp=newtmp.next;
        }
        return newHead;

    }
}
