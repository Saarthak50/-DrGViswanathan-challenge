class ListNode{
    int val;
    ListNode next;
    public ListNode(int val) {
        this.val=val;
    }
}

class Solution{
    public ListNode reverList(ListNode head){
        ListNode prev = null;
        ListNode curr = head;

        while(curr!=null){
            ListNode next = curr.next; 
            
            curr.next =prev;
            prev= curr;
            curr = next;
        }
        return prev;
    }
}

public class Main{

    static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " -> ");
            head = head.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {

        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);

        Solution sol = new Solution();

        System.out.println("Original List:");
        printList(head);

        head = sol.reverseList(head);

        System.out.println("Reversed List:");
        printList(head);
    }
}