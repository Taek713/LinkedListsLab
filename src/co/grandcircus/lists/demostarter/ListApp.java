package co.grandcircus.lists.demostarter;


public class ListApp {

	public static void main(String[] args) {
		MyList list = new MyLinkedList();
		list.addAtBeginning("C");
		list.addAtBeginning("B");
		list.addAtBeginning("A");
		list.removeFromBeginning();
		list.removeFromEnd();
		list.addAtEnd("X");
		list.addAtEnd("Y");
		list.addAtEnd("Z");
		list.removeFromEnd();
		
		System.out.println(list);
		System.out.println(list.size());
	}

}
