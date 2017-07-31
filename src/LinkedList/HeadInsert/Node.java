package LinkedList.HeadInsert;
/*
  Insert Node at the end of a linked list 
  head pointer input could be NULL as well for empty list
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/

Node Insert(Node head,int data) {

	Node temp = new Node();
	temp.data = data;
	temp.next = null;
	
	if(head != null) {
		temp.next = head;
	} else {
		temp = head;
	}
    return temp;	
}


