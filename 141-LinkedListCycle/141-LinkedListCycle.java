// Last updated: 04/04/2026, 15:47:06
public class Solution {
    public boolean hasCycle(ListNode head) {
        if(head==null) return false;
        ListNode fast = head;
        ListNode slow = null;
        while(fast!=null && fast.next!=null&&slow!=fast){
            if(slow==null) {
                slow = head;
            }
            slow=slow.next;
            fast = fast.next.next;
        }
        if(slow==fast) return true;
         return false;
        
    }
}