// Last updated: 04/04/2026, 15:46:56
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode temp = headA;
        int len1=0;
        while(temp!=null) {len1++;
        temp = temp.next;}
        System.out.println(len1);
        temp = headB;
        int len2 =0;
        while(temp!=null) {len2++;
        temp = temp.next;}
        System.out.println(len2);
        int diff = len1 - len2;
        System.out.println(diff);
        ListNode temp2 = null;
        if(diff>=0) {
            temp = headA;
            temp2 = headB;    
        }
        else {
            temp = headB;
            temp2 = headA;
        }
        for(int i=0;i<Math.abs(diff);i++){
            temp = temp.next;
        }
        while(temp!=null){
            if(temp==temp2) return temp;
            temp = temp.next;
            temp2 = temp2.next;
        }
        return null;
    }
}