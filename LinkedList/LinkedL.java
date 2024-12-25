package LinkedList;

public class LinkedL {

    Node head; //define head 
    private int size;
    class Node{
        String data;
        Node next;
        
        Node(String data){
            this.data=data;
            this.next=null;
        }

        
    }
    LinkedL(){
        this.size=0;
    }
    //add - two types 1-> add first 2-> add llast
    //create fuunction 

    //reverse the linked list
    public void reverseIteration(){
        Node prevnode=head;
        Node currnode=head.next;

        if(head==null || head.next==null){
            return ;
        }


        while (currnode != null) {
            Node nextnode= currnode.next;
            currnode.next=prevnode;

            //updating in set of 3

            prevnode=currnode;
            currnode=nextnode;
        }
        head.next=null;
        head=prevnode;
        
    }

    //reverse by recursion

    public Node recurseRecusive(Node head){
        if(head==null || head.next==null){
            return head;
        }

        Node newnoode = recurseRecusive(head.next);
        head.next.next =head ;
        head.next=null;

        return newnoode;
    } 

    public void addFirst(String data){
        Node newnode=new Node(data);
        
        if(head==null){
            head = newnode;
            return;
        }
        size++;
        newnode.next = head;
        head = newnode;
    }

    public void addLast(String data){

        Node newnode=new Node(data);
        
        if(head==null){
            head = newnode;
            return;
        }
        size++;

        Node curnode = head;
        while(curnode.next != null){
            curnode = curnode.next;
        }
        curnode.next=newnode;

    }

    public void printList(){

        if(head==null){
            System.out.println("List is Empty");
            return;
        }
        Node curnode = head;
        while(curnode != null){
            System.out.print(curnode.data+" -> ");
            curnode = curnode.next;
        }
        System.out.println("NULL");
    }

    //delete : 2 types first AND last

    public void deleteFirst(){
        if(head==null){
            System.out.println("The List is empty");
            return;
        }
        size--;
        head=head.next;
    }
    public void deleteLast(){

        //two corner cases 

        if(head==null){
            System.out.println("The List is empty");
            return;
        }
        size--;
        if(head.next==null){
            head=null;
            return;
        }
        

        Node secondLast = head;
        Node Lastnode = head.next;
        while(Lastnode.next != null){
            Lastnode = Lastnode.next;
            secondLast=secondLast.next;
        }

        secondLast.next=null;
        
    }

    public int getSize(){
        return size;
    }

    public static void main(String[] args) {
        LinkedL list = new LinkedL();
        list.addFirst("A");
        list.addFirst("The");
        list.addFirst("Is");
        // list.printList();
        // list.addLast("LinkedList");
        // list.printList();
        // list.addFirst("This");
        // list.printList();
        // list.deleteFirst();
        // list.printList();
        // list.deleteLast();
        list.printList();
        System.out.println(list.getSize()); 
        //list.reverseIteration();
        list.head=list.recurseRecusive(list.head);
        list.printList();
    }
}
