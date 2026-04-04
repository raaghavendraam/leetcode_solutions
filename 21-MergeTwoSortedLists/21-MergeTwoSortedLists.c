// Last updated: 04/04/2026, 15:48:09
/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */

struct ListNode* mergeTwoLists(struct ListNode* list1, struct ListNode* list2) {
    // Dummy node to simplify edge cases
    struct ListNode dummy;
    dummy.next = NULL;

    struct ListNode* curr = &dummy;

    while (list1 != NULL && list2 != NULL) {
        if (list1->val <= list2->val) {
            curr->next = list1;
            list1 = list1->next;
        } else {
            curr->next = list2;
            list2 = list2->next;
        }
        curr = curr->next;
    }

    // Attach remaining nodes
    if (list1 != NULL)
        curr->next = list1;
    else
        curr->next = list2;

    return dummy.next;
}
