// Last updated: 04/04/2026, 15:47:27
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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(left==1&&right==1) return head;
        if(head.next == null) return head;
        ListNode l = head;
        ListNode r = head;
        ListNode prev = null;
        ListNode next = r.next;
        int i =1,j=1;
        while(i<left&&j<right){
            prev = l;
            l=l.next;
            r = r.next;
            i++;j++;
        }
        next = r.next;
        while(i<left){
            prev = l;
            l=l.next;
            i++;
        }
        while(j<right){
            r = r.next;
            j++;
        }
        next = r.next;
        r.next = null;
        if(prev!=null) prev.next = null;
        ListNode n = reverseList(l);
        r = n;
        while(r.next!=null){
            r = r.next;
        }
        if(prev!=null) {
            prev.next=n; 
            r.next = next;
            return head;
        }
        r.next = next;
        return n;
    }
}