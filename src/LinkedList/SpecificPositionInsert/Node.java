package LinkedList.SpecificPositionInsert;
/*
Insert Node at a given position in a linked list 
head can be NULL 
First element in the linked list is at position 0
Node is defined as 
class Node {
   int data;
   Node next;
}
*/
  

Node InsertNth(Node head, int data, int position) {
	
	Node temp = new Node();
	temp.data = data;
	temp.next = null;
	
	if(position == 0) {
		temp.next = head;
		
		return temp;
	} else {
		Node current = head;
		
		int index = 0;
		
		while(current.next != null) {
			if((index + 1) == position) {
				temp.next = current.next;
				current.next = temp;
				break;
			}
			
			current = current.next;
			index++;
		}
	}
	
	return head;
}