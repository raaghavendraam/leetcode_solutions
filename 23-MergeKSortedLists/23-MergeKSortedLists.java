// Last updated: 04/04/2026, 15:48:04
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode temp1 = list1;
        ListNode ans = new ListNode(-1);
        ListNode temp = ans;
        ListNode temp2 = list2;
        while(temp1!=null&temp2!=null){
            if(temp1.val>temp2.val){
                temp.next =temp2;
                temp2 = temp2.next;
            }
            else{
                temp.next = temp1;
                temp1 = temp1.next;
            }
            temp = temp.next;
        }
        while(temp1!=null){
            temp.next = temp1;
            temp1 = temp1.next;
            temp = temp.next;
        }
        while(temp2!=null){
            temp.next =temp2;
            temp2 = temp2.next;
            temp = temp.next;
        }
        return ans.next; 
    }
    public ListNode sortList(ListNode head) {
        if(head==null) return null;
        if(head.next==null) return head;
        ListNode fast = head;
        ListNode slow = head;
        ListNode prev = null;
        while(fast!=null&&fast.next!=null){
            prev=slow;
            slow=slow.next;
            fast = fast.next.next;
        }
        prev.next = null;
        ListNode temp1 = sortList(head);
        ListNode temp2 = sortList(slow);
        return mergeTwoLists(temp1,temp2);
    }
    public ListNode mergeKLists(ListNode[] lists) {
         int n = lists.length;
        if(n == 0) return null;

        ListNode dummy = new ListNode(-1);
        ListNode tail = dummy;

        for(int i = 0; i < n; i++){
            ListNode curr = lists[i];
            while(curr != null){
                tail.next = curr;
                tail = tail.next;
                curr = curr.next;
            }
        }
        return sortList(dummy.next);
    }
}