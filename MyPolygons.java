public class MyPolygons{
	// declare private variables
	private Node current;
	private Node sentinel;
	private int length;
	private int nodePosition;

	// the one with an object of polygon being passed through
	public MyPolygons() {
		// instantiate private variables
		current = null;
		sentinel = null;
		length = 0;
		nodePosition = 0;
	}

	// return list of polygons as a string
	public String toString() {
		// declare and instantiate string
		String printer = "";

		// loop for each node
		for (int i = 0; i < length; i++) {
			// add string to polygon
			printer = printer + current.getData().toString() + "\n";
			// iterate to next node
			next();
		}
		
		// return string
		return printer;
	}

	public void prepend(polygon polygonObject) {
		Node temp = new Node(polygonObject);

		if (length == 0) {
			sentinel = temp;
			current = sentinel;
			sentinel.setNext(sentinel);
			sentinel.setPrevious(sentinel);
			temp = sentinel;
			reset();
		}else{
			temp.setNext(sentinel);
			temp.setPrevious(sentinel.getPrevious());
			sentinel.getPrevious().setNext(temp);
			sentinel.setPrevious(temp);
			temp = sentinel;
			reset();
		}
		length++;
	}

	public void append(polygon polygonObject){
		Node temp = new Node(polygonObject);
		
		if(length == 0){
			sentinel = temp;
			current = sentinel;
			sentinel.setNext(sentinel);
			sentinel.setPrevious(sentinel);
			reset();
		}else{
			temp.setNext(sentinel);
			temp.setPrevious(sentinel.getPrevious());
			sentinel.getPrevious().setNext(temp);
			sentinel.setPrevious(temp);
			reset();
		}
		length++;
	}

	public void insertSort(){								// note to self: double check prepend()
		System.out.println("Sorted List:");
		
		MyPolygons sortedList = new MyPolygons();

		reset();

		for(int i = 0; i < length; i++){
			sortedList.reset();
			if(sortedList.getLength() == 0){
				sortedList.append(sentinel.getData());
			}else if(current.getData().comesBefore(sortedList.getCurrent().getData())){
				sortedList.prepend(current.getData());
			}else{
				for(int j = 0; j < sortedList.getLength(); j++){
					if(current.getData().comesBefore(sortedList.getCurrent().getData())){
						sortedList.insert(current.getData());
					}else{
						sortedList.next();
					}
				}
			}
			next();
		}

		for(int k = 0; k < sortedList.getLength(); k++){
			// remove from unsorted list
			// append from sorted list
			remove();
			append(sortedList.remove());
		}
	}

	public int getLength(){
		return length;
	}

	// accessor method for position of node
	public int getPosition(Node n){
		// create temporary node
		Node tempNode = sentinel;
		
		int i = 1;
		while(i <= length){
			if(tempNode == n){						// sentinel matches the input node
				return i;
			}else{
				// iterate to next node
				tempNode = tempNode.getNext();
			}
			i++;
		}
		return 1;
	}

	public void insert(polygon polygonObject){
		// • insert before a specified (current) item
		if(length == 0){
			append(polygonObject);
		}else{
			Node tempNode = new Node(polygonObject);
			Node tempCurrent = current.getPrevious();
			tempCurrent.setNext(tempNode);
			current.setPrevious(tempNode);
			tempNode.setNext(current);
			tempNode.setPrevious(tempCurrent);
			length++;
			current = current.getPrevious();
			if(nodePosition == 1){
				sentinel = current;
			}
		}
	}
	


	// if(nothing in list)
	// if(there is 1 thing in list)

	public polygon remove(){			// remove from head (AKA remove from sentinel)
		// • take (then remove) an item from the head of the list
		current = sentinel.getNext();
		
		Node temp = sentinel;

		sentinel.getNext().setPrevious(sentinel.getPrevious());
		sentinel.getPrevious().setNext(sentinel.getNext());
		
		sentinel = current;

		length--;
		return temp.getData();
	}

	// set next node of current as current current
	public void next(){
		current = current.getNext();
	}

	// reset position of circular doubly linked list
	public void reset(){
		current = sentinel;
		nodePosition = 1;
	}

	// accessor methods
	public Node getCurrent(){
		return current;
	}

	public Node getSentinel(){
		return sentinel;
	}
}