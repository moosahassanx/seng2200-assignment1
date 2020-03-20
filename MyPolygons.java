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

	public void insertSort(){
		System.out.println("Sorted List:");				// JORDAN BE LIKE key = current.getNext()
		

		reset();
		Node key;

		for(int i = 0; i < length; i++){
			key = current.getNext();
			while(current.getData().comesBefore(key.getData())){
				next();			// node after current now becomes current
				if(key == sentinel){
					break;
				}
			}
			if(key == sentinel){
				break;
			}
	
			while(key.getData().comesBefore(current.getData())){
				if(nodePosition == 1){
					insert(key.getData());
					remove(getPosition(key));
					break;
				}
				current = current.getPrevious();
				nodePosition--;
			}

			if(current != sentinel){
				current = current.getNext();
				insert(key.getData());
				remove(getPosition(key));
			}
		}

		
	}

	// accessor method for position of node
	public int getPosition(Node n){
		// create temporary node
		Node tempNode = sentinel;
		
		int i = 1;
		while(i < length){
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
		if(length <= 0){
			return;
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

	public void remove(int position){
		// • take (then remove) an item from the head of the list
		if(position > length){				// might need an extra condition for when the position is less than 1
			return;
		}else{
			reset();
			while(nodePosition != position){
				current = current.getNext();
				nodePosition++;
			}
			Node tempNode = current.getPrevious();
			tempNode.setNext(current.getNext());
			tempNode = current.getNext();
			tempNode.setPrevious(current.getPrevious());
			current = tempNode;
			length--;
			reset();
		}
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