public class Node{
	private polygon data;
	private Node next, previous;

	public Node(polygon d, Node initialNext, Node initialPrevious){
		data = d;
		next = null;
		previous = null;
	}

	public void setData(polygon d){
		data = d;
	}

	public void setNext(Node n){
		next = n;
	}

	public void setPrevious(Node n){
		previous = n;
	}

	public polygon getData(){
		return data;
	}

	public Node getNext(){
		return next;
	}

	public Node getPrevious(){
		return previous;
	}
}