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
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode res = new ListNode(0);
        while(l1.next!=null && l2.next!=null){
            if(l1.val < l2.val){
                res.next = l1;
                res = res.next;
                l1 = l1.next;
            }else if(l1.val > l2.val){
                res.next = l2;
                res = res.next;
                l2 = l2.next;
            }else{
                l1 = l1.next;
            }
        }

        while(l1.next != null){
            res.next = l1;
            res = res.next;
            l1 = l1.next;
        }
        while(l2.next != null){
            res.next = l2;
            res = res.next;
            l2 = l2.next;
        }
        return res.next;
    }
}
class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}