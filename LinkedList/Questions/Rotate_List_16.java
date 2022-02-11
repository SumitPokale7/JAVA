// https://leetcode.com/problems/rotate-list/

// 61. Rotate List

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

public class Rotate_List_16 {
    public ListNode rotateRight(ListNode head, int k) {

        if (k <= 0 || head == null || head.next == null) {
            return head;
        }

        ListNode Last = head;
        int Length = 1;

        while (Last.next != null) {
            Last = Last.next;
            Length++;
        }

        Last.next = head;

        int Rotation = k % Length;
        int Skip = Length - Rotation;
        ListNode NewLast = head;

        for (int i = 0; i < Skip - 1; i++) {
            NewLast = NewLast.next;
        }

        head = NewLast.next;
        NewLast.next = null;

        return head;
    }
}
