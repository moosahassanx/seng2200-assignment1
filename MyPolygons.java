public class MyPolygons{
	Node current, sentinel;
	int length;

	// the one with an object of polygon being passed through
	public MyPolygons(){
		sentinel = current;
		length = 0;
	}

	public void prepend(polygon d){		// add to head
		// • prepend items into the start of the list (current item is the new first in list)
		length++;
	}

	public void append(polygon d){			// add to tail
		length++;
	}

	public void insert(polygon d, int pos){					// DOUBLE CHECK THIS WITH A DRAWING
		// • insert before a specified (current) item
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
	}

	public Node getCurrent(){
		return current;
	}

	public Node getSentinel(){
		return sentinel;
	}
}

/*
You are required to implement a circular doubly-linked list data structure with the class name
of MyPolygons, using a single sentinel node to mark the start/finish of what will become
a container for Polygon objects.
Note: that you may not have to use all the above methods in this assignment.
*/