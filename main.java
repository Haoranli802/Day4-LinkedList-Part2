// LeetCode 24
class Solution {
    public ListNode swapPairs(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode dummy = new ListNode(0, head);
        ListNode pre = dummy;
        ListNode cur;
        ListNode firstNode, secondNode;
        while(pre.next != null && pre.next.next != null){
            secondNode = pre.next.next.next;
            cur = pre.next;
            firstNode = pre.next.next;
            pre.next = firstNode;
            firstNode.next = cur;
            cur.next = secondNode;
            pre = cur;
            cur = secondNode;
        }
        return dummy.next;
    }
}
//Time: O(N) Space:O(1)


//LeetCode 19
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(-1, head);
        ListNode slow = dummy, fast = dummy;
        for(int i = 0; i < n; i++){
            fast = fast.next;
        }
        while(fast.next != null){
            slow = slow.next;
            fast = fast.next;
        }
        slow.next = slow.next.next;
        return dummy.next;
    }
}
// Time: O(N) Space: O(1)
