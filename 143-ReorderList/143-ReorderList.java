// Last updated: 04/04/2026, 15:47:03
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
    public void reorderList(ListNode head) {
        if(head.next==null) return ;
        ListNode slow = head;
        ListNode fast = head;
        ListNode prev= null;
        while(fast!=null&&fast.next!=null){
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        prev.next = null;
        ListNode head1 = reverseList(slow);
        ListNode temp1 = head;
        ListNode temp2 = head1;
        ListNode ans = new ListNode(-1);
        ListNode temp = ans;
        while(temp1!=null&&temp2!=null){
            temp.next =temp1;
            temp1 = temp1.next;
            temp = temp.next;
            temp.next = temp2;
            temp2 = temp2.next;
            temp = temp.next;
        }
        while(temp1!=null){
            ans.next =temp1;
            temp1 = temp1.next;
            temp = temp.next;
        }
        while(temp2!=null){
            ans.next = temp2;
            temp2 = temp2.next;
            temp = temp.next;
        }
        head = ans.next;
    }
}