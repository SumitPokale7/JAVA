// https://leetcode.com/problems/reorder-list/

// 143. Reorder List

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

public class Reoreder_List_14 {
    public void reorderList(ListNode head) {

        if (head == null || head.next == null) {
            return;
        }

        ListNode Mid = getMid(head);

        ListNode HeadFirst = head;
        ListNode HeadSecond = ReverseLL(Mid);

        // ReArrange

        while (HeadFirst != null && HeadSecond != null) {
            ListNode Temp = HeadFirst.next;
            HeadFirst.next = HeadSecond;
            HeadFirst = Temp;

            Temp = HeadSecond.next;
            HeadSecond.next = HeadFirst;
            HeadSecond = Temp;
        }

        // Next of Tail to Null
        if (HeadFirst != null) {
            HeadFirst.next = null;
        }
    }

    ListNode getMid(ListNode head) {
        ListNode S = head;
        ListNode F = head;

        while (F != null && F.next != null) {
            S = S.next;
            F = F.next.next;
        }
        return S;
    }

    public ListNode ReverseLL(ListNode head) {
        if (head == null) {
            return head;
        }

        ListNode Prev = null;
        ListNode Present = head;
        ListNode Next = Present.next;

        while (Present != null) {
            Present.next = Prev;
            Prev = Present;
            Present = Next;

            if (Next != null) {
                Next = Next.next;
            }
        }
        return Prev;
    }
}
