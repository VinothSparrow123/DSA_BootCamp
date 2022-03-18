package LinkedList;

public class Main {
	public static void main(String[] args) {
		/**
		LinkedList list=new LinkedList();
		list.insertFirst(9);
		list.insertFirst(12);
		list.insertFirst(17);
		list.insertFirst(7);
		list.display();
		list.insertLast(25);
		list.display();
//		System.out.println(list.size);
		list.insert(10, 2);
		list.display();
		list.deleteLast();
		list.display();
		list.delete(3);
		list.display();
		**/
		
		DoublyLinkedList list = new DoublyLinkedList();
		
		list.insertFirst(12);
		list.insertFirst(23);
		list.insertFirst(13);
		list.display();
		System.out.println(list.size);
		list.insertLast(05);
		list.insert(13, 100);
		list.display();
		
	}
	
}
