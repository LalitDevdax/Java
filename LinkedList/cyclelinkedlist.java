package LinkedList;

public class cyclelinkedlist {
    
    static class ListNode {
        int val;
        ListNode next;
    
        ListNode(int val) {
            this.val = val;
        }
    }
    
    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) {
            return false; // No cycle if head is null or there's only one node
        }
        
        ListNode slow = head;
        ListNode fast = head;
        
        while (fast != null && fast.next != null) {
            slow = slow.next;      // Move slow pointer by one step
            fast = fast.next.next; // Move fast pointer by two steps
            
            // Check if slow and fast pointers meet
            if (slow == fast) {
                return true; // Cycle detected
            }
        }
        
        return false; // No cycle found
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
        cyclelinkedlist cycle = new cyclelinkedlist();
    
        // Test Case 1: Linked list with a cycle
        ListNode head1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        head1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node2; // Creates a cycle: 4 -> 2
    
        System.out.println("Test Case 1:");
        System.out.print("Linked List with Cycle: ");
        printLinkedList(head1);
    
        boolean result1 = cycle.hasCycle(head1);
        System.out.println("Has Cycle? " + result1); // Expected output: true
    
        // Test Case 2: Linked list without a cycle
        ListNode head2 = new ListNode(1);
        ListNode node5 = new ListNode(2);
        ListNode node6 = new ListNode(3);
        head2.next = node5;
        node5.next = node6;
    
        System.out.println("\nTest Case 2:");
        System.out.print("Linked List without Cycle: ");
        printLinkedList(head2);
    
        boolean result2 = cycle.hasCycle(head2);
        System.out.println("Has Cycle? " + result2); // Expected output: false
    }
}
