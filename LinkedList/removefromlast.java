package LinkedList;

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) 
    { 
        val = x; 
    }
}

public class removefromlast {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head.next == null) {
            return null;
        }
       
       
        int size = 0;
        ListNode curr = head;
        while(curr != null) {
            curr = curr.next;
            size++;
        }
       
        //removing SIZEth node from last i.e. head
        if(n == size) {
            return head.next;
        }
       
        //find previous node
        int ptf = size - n; // position to find
        ListNode prev = head; // previous node
        int cp = 1; // current position
       
        while(cp != ptf) {
            prev = prev.next;
            cp++;
        }
       
        prev.next = prev.next.next;
        return head;
     
}
    public static void main(String[] args) {
       // Test case: 1 -> 2 -> 3 -> 4 -> 5, remove 2nd from end (n = 2)
       ListNode head = new ListNode(1);
       head.next = new ListNode(2);
       head.next.next = new ListNode(3);
       head.next.next.next = new ListNode(4);
       head.next.next.next.next = new ListNode(5);

       removefromlast solution = new removefromlast();
       
       // Print original list
       System.out.print("Original List: ");
       printList(head);
       
       // Remove 2nd node from the end
       int n = 2;
       ListNode modifiedHead = solution.removeNthFromEnd(head, n);
       
       // Print modified list
       System.out.print("List after removing " + n + "th node from the end: ");
       printList(modifiedHead);
   }
   
   // Utility method to print the linked list
   private static void printList(ListNode head) {
       ListNode curr = head;
       while (curr != null) {
           System.out.print(curr.val + " -> ");
           curr = curr.next;
       }
       System.out.println("NULL");
   }
    }
    
