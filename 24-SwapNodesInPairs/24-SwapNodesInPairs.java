// Last updated: 04/04/2026, 15:48:03

class Solution {
    public ListNode swapPairs(ListNode head) {
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
        // System.out.println(t1.val);
        // System.out.println(t2.val);
        // System.out.println(temp1.next.val);
        // System.out.println(temp2.next.val);
        t1.next = null;
        t2.next = null;
        t1= temp1;
        t2 = temp2;
        ListNode ans1= new ListNode(-1);
        ListNode ans = ans1;
        while(t1!=null&&t2!=null){
            ans.next=t2;
            t2 = t2.next;
            ans = ans.next;
            ans.next = t1;
            t1 = t1.next;
            ans = ans.next;
        }
        while(t1!=null){
            ans.next = t1;
            t1 = t1.next;
            ans = ans.next;
        }
        while(t2!=null){
            ans.next=t2;
            t2 = t2.next;
            ans = ans.next;
        }
        return ans1.next;
    }
}