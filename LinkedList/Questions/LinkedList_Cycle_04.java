// https://leetcode.com/problems/linked-list-cycle/

// 141. Linked List Cycle

// 1. Whenever Question About Cycle Use Fast & Slow Pointer
//  2. Cycle Detection
//  3.  Finding a Node in Cycle, Etc.

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
        next = null;
    }
}

public class LinkedList_Cycle_04 {
    public boolean hasCycle(ListNode head) {
        ListNode fast = head;
        ListNode Slow = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            Slow = Slow.next;
            if (fast == Slow) {
                return true;
            }
        }
        return false;
    }
}
