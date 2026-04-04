// Last updated: 04/04/2026, 15:47:47
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
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null) return head;
        ListNode temp = head;
        int n =0;
        while(temp!=null){
            temp = temp.next;
            n++;
        }
        k = k%n;
        if(k==0) return head;
        int len = n-k+1;//4
        temp = head;
        for(int i = 1;i<len-1;i++){
            temp= temp.next;
        }
        ListNode a = temp.next;
        temp.next = null;
        temp = a;
        while(temp.next!=null){
            temp = temp.next;
        }
        temp.next = head;
        return a;

    }
}