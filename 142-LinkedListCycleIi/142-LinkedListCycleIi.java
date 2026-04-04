// Last updated: 04/04/2026, 15:47:04
public class Solution {
    public ListNode detectCycle(ListNode head) {
        if(head ==null) return null;
        ListNode fast = head;
        ListNode slow = null;
        while(fast!= null&&fast.next != null&& slow!=fast ) {
            if(slow == null) {
                slow = head;
            }
            slow = slow.next;
            fast = fast.next.next;
        }
        if(fast== null||fast.next == null) return null;
        ListNode temp = head;
        while(temp!=slow){
            temp = temp.next;
            slow = slow.next;
        }
        return temp;
    }
}