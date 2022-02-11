// https://leetcode.com/problems/sort-list/

// 148. Sort List

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

public class Merge_Sort_List_09 {
    // Using Merge Sort
    public ListNode sortList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode Mid = getMid(head);
        ListNode Left = sortList(head);
        ListNode Right = sortList(Mid);

        return mergeTwoLists(Left, Right);
    }

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode TempHead = new ListNode();
        ListNode Tail = TempHead;
        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                Tail.next = list1;
                list1 = list1.next;
                Tail = Tail.next;
            } else {
                Tail.next = list2;
                list2 = list2.next;
                Tail = Tail.next;
            }
        }
        Tail.next = (list1 != null) ? list1 : list2;
        return TempHead.next;
    }

    ListNode getMid(ListNode head) {
        ListNode MidPrev = null;
        while (head != null && head.next != null) {
            MidPrev = (MidPrev == null) ? head : MidPrev.next;
            head = head.next.next;
        }
        ListNode Mid = MidPrev.next;
        MidPrev.next = null;

        return Mid;
    }

}
