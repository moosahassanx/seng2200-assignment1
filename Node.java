public class Node{
	private polygon data;
	private Node next, previous;
	private int position;

	public Node(polygon d){
		data = d;
		next = null;
		previous = null;
	}

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