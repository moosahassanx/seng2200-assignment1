public class Node{
	private int data;
	private Node next, previous;

	public Node(int d, Node nx, Node px){
		data = d;
		next = nx;
		previous = px;
	}

	public void setData(int d){
		data = d;
	}

	public void setNext(Node n){
		next = n;
	}

	public void setPrevious(Node n){
		previous = n;
	}

	public int getData(){
		return data;
	}

	public Node getNext(){
		return next;
	}

	public Node getPrevious(){
		return previous;
	}
}