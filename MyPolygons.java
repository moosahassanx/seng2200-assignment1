public class MyPolygons
{
    // declare private variables
    private Node current;
    private Node sentinel;
    private int length;
    
    // the one with an object of polygon being passed through
    public MyPolygons() {
        // instantiate private variables
        current = null;
        sentinel = null;
        length = 0;
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

    public void prepend(final polygon polygonObject) {
        append(polygonObject);
        sentinel = sentinel.getPrevious();
        reset();
    }

    public void append(final polygon polygonObject) {
        final Node temp = new Node(polygonObject);

        if (length == 0) {
            sentinel = temp;
            sentinel.setNext(sentinel);
            sentinel.setPrevious(sentinel);
            reset();
        } else {
            temp.setNext(sentinel);
            temp.setPrevious(sentinel.getPrevious());
            sentinel.getPrevious().setNext(temp);
            sentinel.setPrevious(temp);
            reset();
        }
        length++;
    }

    public MyPolygons insertSort() { // note to self: double check prepend()
        System.out.println("Sorted List:");

        final MyPolygons sortedList = new MyPolygons();

        reset(); // set current as sentinel (first position) TOP LIST

        for (int i = 0; i < length; i++) {
            sortedList.reset();
            if (sortedList.getLength() == 0) {
                sortedList.append(sentinel.getData());
            } else if (current.getData().comesBefore(sortedList.current.getData())) {
                sortedList.prepend(current.getData());
            } else {
                sortedList.next();

                for (int j = 1; j < sortedList.getLength(); j++) {
                    if (current.getData().comesBefore(sortedList.getCurrent())) {
                        break;
                    } else {
                        sortedList.next();
                    }
                }
                sortedList.insert(current.getData());
            }
            next();
        }

        return sortedList;
    }

    public int getLength() {
        return length;
    }

    // accessor method for position of node
    public int getPosition(final Node n) {
        // create temporary node
        Node tempNode = sentinel;

        int i = 1;
        while (i <= length) {
            if (tempNode == n) { // sentinel matches the input node
                return i;
            } else {
                // iterate to next node
                tempNode = tempNode.getNext();
            }
            i++;
        }
        return 1;
    }

    public void insert(final polygon polygonObject) {
        // • insert before a specified (current) item
        if (length == 0) {
            append(polygonObject);
            current = sentinel;
        } else {
            final Node tempNode = new Node(polygonObject);
            tempNode.setPrevious(current.getPrevious());
            tempNode.setNext(current);
            current.getPrevious().setNext(tempNode);
            current.setPrevious(tempNode);
            length++;
        }
    }

    public polygon remove() { // remove from head (AKA remove from sentinel)
        // • take (then remove) an item from the head of the list
        current = sentinel.getNext();

        if (length == 0) { // if there are no nodes in the linked list
            // do nothing
        } else if (length == 1) { // if there is 1 node in the linked list
            sentinel = null;
        } else {
            final Node temp = sentinel;

            sentinel.getNext().setPrevious(sentinel.getPrevious());
            sentinel.getPrevious().setNext(sentinel.getNext());

            sentinel = current;

            length--;
            return temp.getData();
        }
        return current.getData();
    }

    // set next node of current as current current
    public void next() {
        current = current.getNext();
    }

    // reset position of circular doubly linked list
    public void reset() {
        current = sentinel;
    }

    // accessor methods
    public polygon getCurrent()
    {
        return current.getData();
    }

    public polygon getSentinel()
    {
        return sentinel.getData();
    }
}