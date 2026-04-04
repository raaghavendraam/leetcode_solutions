// Last updated: 04/04/2026, 15:48:16
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
       ListNode temp1 = l1;
       ListNode temp2 = l2;
       int carry =0;
       ListNode ans = new ListNode(-1);
       ListNode t = ans;
       while(temp1!=null&&temp2!=null){
            int sum = carry+temp1.val+temp2.val;
            carry = sum/10;
            sum = sum%10;
            ListNode temp = new ListNode(sum);
            t.next = temp;
            t = t.next;
            temp1 = temp1.next;
            temp2 =temp2.next;
       } 
       while(temp1!=null){
            int sum = carry+temp1.val;
            carry = sum/10;
            sum = sum%10;
            ListNode temp = new ListNode(sum);
            t.next = temp;
            t = t.next;
            temp1 = temp1.next;
       }
       while(temp2!=null){
            int sum = carry+temp2.val;
            carry = sum/10;
            sum = sum%10;
            ListNode temp = new ListNode(sum);
            t.next = temp;
            t = t.next;
            temp2 = temp2.next;
       }
       if(carry == 1){
            ListNode temp = new ListNode(1);
            t.next = temp;
       }
       return ans.next;
    }
}