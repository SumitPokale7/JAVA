
// https://leetcode.com/problems/reverse-linked-list-ii/

// 92. Reverse Linked List II

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

public class Reverse_LinkedListII_12 {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if (left == right) {
            return head;
        }

        // Skip the First Left - 1 nodes
        ListNode Current = head;
        ListNode Prev = null;

        for (int i = 0; Current != null && i < left - 1; i++) {
            Prev = Current;
            Current = Current.next;
        }

        ListNode Last = Prev;
        ListNode NewEnd = Current;

        // Reverse Between Left And Right

        ListNode Next = Current.next;

        for (int i = 0; Current != null && i < right - left + 1; i++) {
            Current.next = Prev;
            Prev = Current;
            Current = Next;

            if (Next != null) {
                Next = Next.next;
            }
        }
        if (Last != null) {
            Last.next = Prev;
            Last.next = Prev;
        } else {
            head = Prev;
        }
        NewEnd.next = Current;
        return head;
    }
}
