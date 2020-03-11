public class MyPolygons{
	
	Node head = new Node(null, null, null);
	Node tail = new Node(null, null, null);
	Node current = new Node(null, null, null);

	public MyPolygons(){
		head = Node(polygonObject1);
	}

	public void prepend(){
		// • prepend items into the start of the list (current item is the new first in list)
		current = head;
	}

	public void append(){
		// • append items into the end of the list (current item is the first in list)
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
}

/*
You are required to implement a circular doubly-linked list data structure with the class name
of MyPolygons, using a single sentinel node to mark the start/finish of what will become
a container for Polygon objects.
Note: that you may not have to use all the above methods in this assignment.
*/