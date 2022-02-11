
// https://leetcode.com/problems/palindrome-linked-list/

// 234. Palindrome Linked List

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

public class Palindrome_Linked_List_13 {

    public boolean isPalindrome(ListNode head) {

        ListNode Mid = getMid(head);
        ListNode headSecond = ReverseLL(Mid);
        ListNode ReReverseHead = headSecond;

        // Compare Both the half
        while (head != null && headSecond != null) {
            if (head.val != headSecond.val) {
                break;
            }

            head = head.next;
            headSecond = headSecond.next;
        }
        ReverseLL(ReReverseHead);

        // if (head == null || headSecond == null) {
        // return true;
        // }
        // return false;

        return head == null || headSecond == null;
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
