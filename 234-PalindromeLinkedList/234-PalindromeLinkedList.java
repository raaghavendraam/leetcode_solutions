// Last updated: 04/04/2026, 15:46:25
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
    public boolean isPalindrome(ListNode head) {
        if(head.next==null) return true;
        ListNode fast = head;
        ListNode slow = head;
        ListNode prev = null;
        while(fast!= null&&fast.next!=null){
            prev =slow;
            slow=slow.next;
            fast = fast.next.next;
        }
        prev.next = null;
        if(fast != null) slow = slow.next;
        ListNode head1 = reverseList(slow);
        fast = head;
        slow = head1;
        while(fast!=null&&slow!=null){
            if(fast.val!=slow.val){
                return false;
            }
            fast = fast.next;
            slow = slow.next;
        }
        if(fast!=null||slow!=null) return false;
        return true;
    }
}