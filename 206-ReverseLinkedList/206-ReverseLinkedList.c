// Last updated: 04/04/2026, 15:46:47
/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */

struct ListNode* reverseList(struct ListNode* head) {
    struct ListNode* prev = NULL;
    struct ListNode* curr = head;

    while (curr != NULL) {
        struct ListNode* nextNode = curr->next; // store next
        curr->next = prev;                      // reverse link
        prev = curr;                            // move prev
        curr = nextNode;                        // move curr
    }

    return prev; // new head
}
