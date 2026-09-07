// Last updated: 07/09/2026, 08:47:50
/*
// Definition for a Node.
class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;
};
*/

class Solution {
    public Node flatten(Node head) {
        Node temp = head;
        while(temp!=null){
        Node n =temp.next;
        if(temp.child!=null){
        Node r = flatten(temp.child);
        Node last = r;
        while(last.next!=null) last =last.next;
        temp.child = null;
        temp.next = r;
        r.prev = temp;
        last.next = n;
        if(n!=null)n.prev = last;
        }
        temp = n;
        }
        return head;
    }
}