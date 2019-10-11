
public class ReverseInGroupsOfK {
	Node head ;
	
	class Node {
		int data; 
        Node next; 
        Node(int d) {
        	data = d; 
        	next = null; 
        } 
	}
	Node reverse(Node head,int k) {
		   Node current = head; 
	       Node next = null; 
	       Node prev = null;   
	       int count = 0; 
	       while (count < k && current != null)  
	       { 
	           next = current.next; 
	           current.next = prev; 
	           prev = current; 
	           current = next; 
	           count++; 
	       } 
	  
	       /* next is now a pointer to (k+1)th node  
	          Recursively call for the list starting from current. 
	          And make rest of the list as next of first node */
	       if (next != null)  
	          head.next = reverse(next, k); 
	       // prev is now head of input list 
	       return prev; 
	}
	public void push(int new_data) 
    { 
        Node new_node = new Node(new_data); 
        new_node.next = head; 
        head = new_node; 
    } 
    void printList() 
    { 
        Node temp = head; 
        while (temp != null) 
        { 
           System.out.print(temp.data+" "); 
           temp = temp.next; 
        }   
        System.out.println(); 
    } 
	public static void main(String[] args) {
		ReverseInGroupsOfK ll = new ReverseInGroupsOfK() ;
		
		ll.push(10);
		ll.push(9);
		ll.push(8);
		ll.push(7);
		ll.push(6);
		ll.push(5);
		ll.push(4);
		ll.push(3);
		ll.push(2);
		ll.push(1);
		
		System.out.println("Given List : ") ;
		ll.printList();
		ll.head = ll.reverse(ll.head, 4) ;
		
		System.out.println("Reversed List : ") ;
		ll.printList();
	}
}
