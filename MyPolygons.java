public class MyPolygons{
	// the one with an object of polygon being passed through
	public MyPolygons(polygon d){
		Node head = new Node(d);
		Node tail = head;
		Node current = tail;
		int length = 1;
	}

	public void prepend(polygon d){		// add to head
		// • prepend items into the start of the list (current item is the new first in list)
		Node tempNode = new Node(d);
		if(head == null){
			tempNode.setNext(tempNode);
			tempNode.setPrev(tempNode);
			head = tempNode;
			tail = head;
		}else{
            tempNode.setPrev(head);
            head.setNext(tempNode);
            tail.setPrev(tempNode);
            tempNode.setNext(tail);
            head = tempNode;
		}
		length++;
	}

	public void append(polygon d){			// add to tail
		Node tempNode = new Node(d);
		if(tail == null){
			tempNode.setNext(tempNode);
			tempNode.setPrev(tempNode);
			head = tempNode;
			tail = head;
		}else{
			tempNode.setPrev(head);
            head.setNext(tempNode);
            tail.setPrev(tempNode);
            tempNode.setNext(tail);
            tail = tempNode;
		}
		length++;
	}

	public void insert(Polygon d, int pos){					// DOUBLE CHECK THIS WITH A DRAWING
		// • insert before a specified (current) item
		current = start;
		while(current.getNext() != null){
			if(current.getNext().getPosition() == pos){
				Node tempNode = new Node(d);
				tempNode.getNext() = current.getNext();
				current.getNext() = tempNode;
				return;
			}
			current = current.getNext();
		}
	}

	public void next(){
		// • step to the next item (making it the current item)
		// COMMENT THIS OUT WHEN YOURE DONE
		current = current.getNext();
	}

	public void reset(){
		// • reset the current item variable to the start of your list
	}

	public void removeFromHead(){			// https://www.javatpoint.com/deletion-in-circular-doubly-linked-list-at-beginning
		// • take (then remove) an item from the head of the list
		if(head == null){
			return;
		}else if(length == 1){
			head = null;
			tail = null;
			current = null;
			length--;
		}else{
			Node tempNode = head;
			head = tempNode.getPrevious();
			tempNode = null;
			length--;
		}
	}

	public Node getCurrent(){
		return current;
	}

	public Node getHead(){
		return head;
	}
}

/*
You are required to implement a circular doubly-linked list data structure with the class name
of MyPolygons, using a single sentinel node to mark the start/finish of what will become
a container for Polygon objects.
Note: that you may not have to use all the above methods in this assignment.
*/