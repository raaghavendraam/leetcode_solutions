// Last updated: 04/04/2026, 15:44:33
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
    public int pairSum(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        ListNode prev = null;
        while(fast!= null&&fast.next!=null){
            prev =slow;
            slow=slow.next;
            fast = fast.next.next;
        }
        prev.next = null;
        // if(fast != null) slow = slow.next;
        ListNode head1 = reverseList(slow);
        fast = head;
        slow = head1;
        int max = Integer.MIN_VALUE;
        while(fast!=null&&slow!=null){
            int sum = fast.val+slow.val;
            max = Math.max(max,sum);
            fast = fast.next;
            slow = slow.next;
        }
       return max;
    }
}