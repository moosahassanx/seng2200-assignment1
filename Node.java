public class Node{
	// declare private variables and objects
	private polygon data;
	private Node next, previous;
	private int position;

	// constructor
	public Node(polygon d){
		// instantiate variables and objects
		data = d;
		next = null;
		previous = null;
	}

	// mutator methods
	public void setData(polygon d){
		data = d;
	}

	public void setPosition(int pos){
		position = pos;
	}

	public void setNext(Node n){
		next = n;
	}

	public void setPrevious(Node n){
		previous = n;
	}

	// accessor methods
	public polygon getData(){
		return data;
	}

	public int getPosition(){
		return position;
	}

	public Node getNext(){
		return next;
	}

	public Node getPrevious(){
		return previous;
	}
}