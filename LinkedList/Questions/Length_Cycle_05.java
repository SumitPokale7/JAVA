//  find the Length of the Cycle

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
        next = null;
    }
}

public class Length_Cycle_05 {
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
