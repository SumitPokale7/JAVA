// https://leetcode.com/problems/reverse-nodes-in-k-group/

// 25. Reverse Nodes in k-Group

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

public class reverse_K_Node_15 {
    public ListNode reverseAlternateKGroup(ListNode head, int k) {

        // It's Also Reversing the < k end items

        if (k <= 1 || head == null) {
            return head;
        }

        // Skip the First Left - 1 nodes
        ListNode Current = head;
        ListNode Prev = null;

        while (Current != null) {

            ListNode Last = Prev;
            ListNode NewEnd = Current;

            // Reverse Between Left And Right

            ListNode Next = Current.next;

            for (int i = 0; Current != null && i < k; i++) {
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

            // Skip the K Nodes
            for (int i = 0; Current != null && i < k; i++) {
                Prev = Current;
                Current = Current.next;
            }
        }
        return head;

    }

    // https://www.geeksforgeeks.org/reverse-alternate-k-nodes-in-a-singly-linked-list/

    // Reverse Alternate K-Group in a Singly Linked List
    public ListNode reverseKGroup(ListNode head, int k) {

        // It's Also Reversing the < k end items

        if (k <= 1 || head == null) {
            return head;
        }

        // Skip the First Left - 1 nodes
        ListNode Current = head;
        ListNode Prev = null;

        while (true) {

            ListNode Last = Prev;
            ListNode NewEnd = Current;

            // Reverse Between Left And Right

            ListNode Next = Current.next;

            for (int i = 0; Current != null && i < k; i++) {
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

            if (Current == null) {
                break;
            }

            Prev = NewEnd;
        }
        return head;

    }
}
