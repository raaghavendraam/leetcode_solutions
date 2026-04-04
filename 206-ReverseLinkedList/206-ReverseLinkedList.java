// Last updated: 04/04/2026, 15:46:43
class Solution {
    public ListNode reverseList(ListNode head) {
        if(head==null||head.next==null) return head; 
        ListNode prev = null;
        ListNode cur = head;
        ListNode fast = head.next;
        while(fast!=null){
            cur.next=prev;
            prev =cur;
            cur = fast;
            fast = fast.next;
        }
        cur.next = prev;
        return cur;
    }
}