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

// LeetCode 160
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int lenA = 0;
        int lenB = 0;
        ListNode head1 = headA;
        ListNode head2 = headB;
        while(head1 != null){
            lenA ++;
            head1 = head1.next;
        }
        while(head2 != null){
            lenB ++;
            head2 = head2.next;
        }
        int count = 0;
        if(lenA >= lenB){
            head1 = headA;
            head2 = headB;
            count = lenA - lenB;
        }
        else{
            head1 = headB;
            head2 = headA;
            count = lenB - lenA;
        }
        while(head1 != null){
            if(count > 0){
                head1 = head1.next;
                count --;
            }
            else{
                if(head1 == head2) return head1;
                head1 = head1.next;
                head2 = head2.next;
            }
        }
        return null;
    }
}

//Time: O(N) Space: O(1)
