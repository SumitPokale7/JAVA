// https://leetcode.com/problems/linked-list-cycle-ii/

//  142. Linked List Cycle II

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
        next = null;
    }
}

public class LinkedList_Cycle_II_06 {
    public ListNode detectCycle(ListNode head) {
        int Length = 0;
        ListNode fast = head;
        ListNode Slow = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            Slow = Slow.next;
            if (fast == Slow) {
                Length = hasCycle(Slow);
                break;
            }
        }

        if (Length == 0) {
            return null;
        }

        // Find the Start Node
        ListNode f = head;
        ListNode s = head;

        while (Length > 0) {
            s = s.next;
            Length--;
        }
        // Keep Moving both forward And they will meet at Cycle Start
        while (f != s) {
            f = f.next;
            s = s.next;
        }
        return s;
    }

    public int hasCycle(ListNode head) {
        ListNode fast = head;
        ListNode Slow = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            Slow = Slow.next;
            if (fast == Slow) {
                // Calcualte the length
                ListNode temp = Slow;
                int Length = 0;
                do {
                    temp = temp.next;
                    Length++;
                } while (temp != Slow);
                return Length;
            }
        }
        return 0;
    }
}
