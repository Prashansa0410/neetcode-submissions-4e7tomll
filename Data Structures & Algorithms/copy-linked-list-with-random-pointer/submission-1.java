class Solution {
    public Node copyRandomList(Node head) {
        if (head == null) return null;

        HashMap<Node, Node> map = new HashMap<>();

        // Create the head of the new list and store the mapping
        Node node = new Node(head.val);
        map.put(head, node);

        Node newHead = node;
        Node oldtmp = head.next;
        Node newtmp = newHead;

        // Create the rest of the new list and build the map
        while (oldtmp != null) {
            Node newNode = new Node(oldtmp.val);
            map.put(oldtmp, newNode);
            newtmp.next = newNode;
            newtmp = newtmp.next;
            oldtmp = oldtmp.next;
        }

        // Set up the random pointers
        oldtmp = head;
        newtmp = newHead;

        while (oldtmp != null) {
            newtmp.random = map.get(oldtmp.random); // could be null
            oldtmp = oldtmp.next;
            newtmp = newtmp.next;
        }

        return newHead;
    }
}
