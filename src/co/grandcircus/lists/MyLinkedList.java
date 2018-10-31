package co.grandcircus.lists;

public class MyLinkedList implements MyList {

	// head is the first node in the list. if null, the list is empty.
	private Node head = null;
	// for convenience, keep track of how many items are in the list
	private int length = 0;

	@Override
	public void addAtBeginning(String data) {
		// add a new node and set it as the new head
		Node newNode = new Node(data);
		newNode.setNext(head);
		head = newNode;
		length++;
	}

	@Override
	public void removeFromBeginning() {
		// find the second node and set it as the new head
		head = head.getNext();
		length--;
	}

	@Override
	public void addAtEnd(String data) {
		if (length < 1) {
			addAtBeginning(data);
		}
		Node newNode = new Node(data);
		Node oldTail = getNodeAt(length - 1);
		oldTail.setNext(newNode);
		length++;

	}

	@Override
	public void removeFromEnd() {
		if (length < 2) {
			// The beginning is the end.
			removeFromBeginning();
		} else {
			// find the node right before the end.
			Node beforeTail = getNodeAt(length - 2);
			// set its next to null. This ends the list here.
			beforeTail.setNext(null);
			length--;
		}
	}

	@Override
	public String get(int index) {
		return getNodeAt(index).getData();
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		// start at the head
		Node node = head;
		// follow the links between nodes until it reaches the end
		while (node != null) {
			sb.append(node.toString());
			node = node.getNext();
		}
		return sb.toString();
	}

	@Override
	public int size() {
		return length;
	}

	private Node getNodeAt(int index) {
		// start at the head
		Node node = head;
		// follow the links between nodes until it counts off the right number
		for (int i = 0; i < index; i++) {
			if (node == null) {
				// In case we run out of nodes before we get up to the desired index, return
				// null
				return null;
			}
			node = node.getNext();
		}
		return node;
	}

	@Override
	public void removeAt(int index) {
		Node removeNode = new Node();
		Node current = head;
		int count = 0;
		for (int i = count - 1; i >= 0; i--) {

			if (i == index) {
				removeNode = current.getNext();
				current.setNext(removeNode.getNext());
				count--;
			}
			current = current.getNext();
		}
	}
@Override
	public void insertAt(int index, Object o) {
		
		String data = null;
		if(length == 0) {
			insertAt(index, o);
		} else {
			Node tail = getNodeAt(index);
			tail.setNext(new Node(data, null));
			length++;
		}
		
	}

}
