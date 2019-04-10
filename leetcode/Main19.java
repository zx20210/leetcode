package leetcode;

public class Main19 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int count=1;
        ListNode current = head;
        while(current.next!=null){
            count++;
            current = current.next;
        }
        if(count == 1){
            return null;
        }else if(count == n){
            return head.next;
        }
        int index = 0;
        current = head;
        ListNode last = current;
        while(index < count-n){
            last = current;
            current = current.next;
            index++;
        }
        last.next = current.next;
        current.next = null;
        // System.out.println(current.val);
        return head;
    }
}
class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}