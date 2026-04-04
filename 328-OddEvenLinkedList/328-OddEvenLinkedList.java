// Last updated: 04/04/2026, 15:46:04
class Solution {
    public ListNode oddEvenList(ListNode head) {
        if(head==null) return null;
        if(head.next==null) return head;
        ListNode temp1 = new ListNode(-1);
        ListNode temp2 = new ListNode(-1);
        ListNode temp = head;
        ListNode t1 = temp1;
        ListNode t2 = temp2;
        int count =1;
        while(temp != null){
            if(count%2!=0){
                t1.next = temp;
                temp = temp.next;
                count++;
                t1 =t1.next;
            }
            else{
                t2.next = temp;
                temp = temp.next;
                count++;
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