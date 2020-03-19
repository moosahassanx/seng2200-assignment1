public class MyPolygons{
	Node current, sentinel, start;
	int length;

	// the one with an object of polygon being passed through
	public MyPolygons(){
		current = null;
		sentinel = null;
		start = null;
		length = 0;
	}

	public String toString(){
		String printer = "";

		for(int i = 0; i < length; i++){
			printer = printer + current.getData().toString() + "\n";
			next();
		}

        return printer;
	}

	public void prepend(polygon polygonObject){
		Node temp = new Node(polygonObject);
		
		if(length == 0){
			sentinel = temp;
			current = sentinel;
			start = sentinel;
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
	
	/*
	for(int i = 0; i < number of nodes; i++){
		if(node1.comesBefore(node2)){
			// code
		}else{
			
		}
	}
	*/


	public void insertSort(){
		System.out.println("Sorted List:");
		
		if(current.getData().comesBefore(current.getNext().getData())){
			System.out.println("24.5 is less than 13.5399999996");
			// swap current WITH current.getNext()
			Node tempCurrent = new Node(current.getData());
			Node tempNext = new Node(current.getNext().getData());
			current.setData(tempNext.getData());
			current.getNext().setData(tempCurrent.getData());
		}else{
			System.out.println("24.5 is greater than 13.5399999996");
		}

		if(current.getData().comesBefore(current.getPrevious().getData())){
			System.out.println("24.5 is less than 27.66");
		}else{
			System.out.println("24.5 is greater than 27.66");
		}
	}

	public void insert(polygon polygonObject, int pos){					// DOUBLE CHECK THIS WITH A DRAWING
		// • insert before a specified (current) item
	}

	public void next(){
		current = current.getNext();
	}

	public void reset(){
		current = sentinel;
	}

	public void removeFromHead(){
		// • take (then remove) an item from the head of the list
		length--;
	}

	public Node getCurrent(){
		return current;
	}

	public Node getSentinel(){
		return sentinel;
	}
}