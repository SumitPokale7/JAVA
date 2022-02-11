// https://leetcode.com/problems/middle-of-the-linked-list/submissions/

// 876. Middle of the Linked List

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

public class Middle_LinkedList_08 {
    public ListNode middleNode(ListNode head) {
        ListNode Slow = head;
        ListNode Fast = head;

        while (Fast != null && Fast.next != null) {
            Slow = Slow.next;
            Fast = Fast.next.next;
        }

        return Slow;
    }
}
