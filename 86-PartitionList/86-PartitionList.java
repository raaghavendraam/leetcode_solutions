// Last updated: 04/04/2026, 15:47:29
class Solution {
    public ListNode partition(ListNode head, int x) {
        if(head==null) return null;
        if(head.next==null) return head;
        ListNode temp1 = new ListNode(-1);
        ListNode temp2 = new ListNode(-1);
        ListNode temp = head;
        ListNode t1 = temp1;
        ListNode t2 = temp2;
        while(temp != null){
            if(temp.val<x){
                t1.next = temp;
                temp = temp.next;
                t1 =t1.next;
            }
            else{
                t2.next = temp;
                temp = temp.next;
                t2 = t2.next;
            }
        }
        temp1 = temp1.next;
        temp2 = temp2.next;
        if(temp1==null) return temp2;
        t1.next = temp2;
        t2.next =null;
        return temp1;
    }
}