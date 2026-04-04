// Last updated: 04/04/2026, 15:45:54
class Solution {

    public ListNode reverseList(ListNode head){
        ListNode prev = null;

        while(head != null){
            ListNode next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }

        return prev;
    }

    public int length(ListNode head){
        int len = 0;
        while(head != null){
            len++;
            head = head.next;
        }
        return len;
    }

    public ListNode pad(ListNode head, int diff){
        while(diff-- > 0){
            ListNode node = new ListNode(0);
            node.next = head;
            head = node;
        }
        return head;
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        int len1 = length(l1);
        int len2 = length(l2);

        if(len1 < len2)
            l1 = pad(l1, len2 - len1);
        else
            l2 = pad(l2, len1 - len2);

        l1 = reverseList(l1);
        l2 = reverseList(l2);

        int carry = 0;
        ListNode dummy = new ListNode(-1);
        ListNode t = dummy;

        while(l1 != null || l2 != null || carry != 0){

            int sum = carry;

            if(l1 != null){
                sum += l1.val;
                l1 = l1.next;
            }

            if(l2 != null){
                sum += l2.val;
                l2 = l2.next;
            }

            carry = sum / 10;

            t.next = new ListNode(sum % 10);
            t = t.next;
        }

        return reverseList(dummy.next);
    }
}