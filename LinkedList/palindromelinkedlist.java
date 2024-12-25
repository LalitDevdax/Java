package LinkedList;


public class palindromelinkedlist {
    public ListNode getMiddle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while (fast.next != null && fast.next.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
     }
     
     
     public ListNode reverse(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
       
        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
     }
     
     
     
     
     public boolean isPalindrome(ListNode head) {
        if(head == null || head.next == null) {
            return true;
        }
       
        ListNode firstHalfEnd = getMiddle(head);
        ListNode secondHalfStart = reverse(firstHalfEnd.next);
        ListNode firstHalfStart = head;
       
        while(secondHalfStart != null) {
            if(secondHalfStart.val != firstHalfStart.val) {
                return false;
            }
            secondHalfStart = secondHalfStart.next;
            firstHalfStart = firstHalfStart.next;
        }
       
        return true;
     }

     public static void printLinkedList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println();
    }
     
     public static void main(String[] args) {
        palindromelinkedlist pal = new palindromelinkedlist();

        // Test Case 1: Palindrome linked list
        ListNode head1 = new ListNode(1);
        head1.next = new ListNode(2);
        head1.next.next = new ListNode(3);
        head1.next.next.next = new ListNode(2);
        head1.next.next.next.next = new ListNode(1);

        System.out.println("Test Case 1:");
        System.out.print("Original List: ");
        printLinkedList(head1);

        boolean result1 = pal.isPalindrome(head1);
        System.out.println("Is Palindrome? " + result1);

        
     }
}
