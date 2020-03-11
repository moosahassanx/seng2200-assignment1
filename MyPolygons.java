public class MyPolygons{
	
	// the one with no object being passed through (everything is just null) UNCOMMENT LATER
	/*
	public MyPolygons(){
		Node head = new Node(null);
		Node tail = new Node(null);
		Node current = new Node(null);
		int length = 0;
	}
	*/

	// the one with an object of polygon being passed through
	public MyPolygons(){
		polygon polygonObject1 = new polygon();
		Node head = new Node(polygonObject1);
		Node tail = head;
		Node current = tail;
		int length = 1;
	}

	public void prepend(){		// add to head
		// • prepend items into the start of the list (current item is the new first in list)
		Node tempNode = new Node(polygon polygonData);
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

	public void append(){			// add to tail
		Node tempNode = new Node(polygon polygonData);
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

	public void insert(){
		// • insert before a specified (current) item
	}

	public void next(){
		// • step to the next item (making it the current item)
	}

	public void reset(){
		// • reset the current item variable to the start of your list
	}

	public void removeFromHead(){
		// • take (then remove) an item from the head of the list
	}

	public Node getCurrent(){
		return current;
	}

	public Node getHead(){
		return head;
	}

	public void setCurrent(Node newC){
		current = newC;
	}
}

/*
You are required to implement a circular doubly-linked list data structure with the class name
of MyPolygons, using a single sentinel node to mark the start/finish of what will become
a container for Polygon objects.
Note: that you may not have to use all the above methods in this assignment.
*/