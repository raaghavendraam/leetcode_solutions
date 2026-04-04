// Last updated: 04/04/2026, 15:47:32
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null) return head;
        ListNode a = head;
        ListNode b = head;
        ListNode ans = new ListNode(-1);
        ListNode temp = ans;
        while(b!=null){
            if(a.val==b.val) b= b.next;
            else{
                temp.next = a;
                temp = temp.next;
                a=b;
            }
        }
        temp.next = a;
        temp = temp.next;
        temp.next = null;
        return ans.next;
    }
}