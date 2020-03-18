public class MyPolygons{
	Node current, sentinel, head, tail;
	int length;

	// the one with an object of polygon being passed through
	public MyPolygons(){
		current = null;
		sentinel = null;
		head = null;
		tail = null;
		length = 0;
	}

	public String toString(){																		// PA1 CODING!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
		String printer = "";

		for(int i = 0; i < length; i++)
        {
            printer += current.getData().toString()+"\n";
            //System.out.println(current.getData());
            next();
        }

        return printer;
	}

	public void prepend(polygon polygonObject){		// add to head
		// • prepend items into the start of the list (current item is the new first in list)
		length++;
	}

	public void append(polygon polygonObject){			// add to tail
		Node temp = new Node(polygonObject);       
        //if its empty just add																		// PA1 CODING!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
        if (head == null)
        {
            temp.setNext(temp);
            temp.setPrevious(temp);
            head = temp;
            tail = head;
            current = tail;
        }
        //making sure next and previous is set correctly
        else
        {
            temp.setPrevious(tail);
            tail.setNext(temp);
            head.setPrevious(temp);
            temp.setNext(head);
            tail = temp;
            current = tail;
        }
        //updates size
		length++;
	}

	public void insert(polygon polygonObject, int pos){					// DOUBLE CHECK THIS WITH A DRAWING
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