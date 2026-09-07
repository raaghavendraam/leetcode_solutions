// Last updated: 07/09/2026, 08:48:11
class Solution {
    public ListNode swapNodes(ListNode head, int k) {
        ListNode fast = head;
        ListNode slow = head;
        for(int i =0;i<k-1;i++){
            fast = fast.next;
        }
        ListNode node1 = fast;
        
        while(fast.next!=null){
            slow = slow.next;
            fast = fast.next;
        }
        int temp = slow.val;
        slow.val = node1.val;
        node1.val = temp;
        return head;
    }
}