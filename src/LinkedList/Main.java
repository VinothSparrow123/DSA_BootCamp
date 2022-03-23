package LinkedList;

public class Main {
	
	
	
	public static void main(String[] args) {
		
		LinkedList list=new LinkedList();
		
//		list.insertFirst(9);
//		list.insertFirst(12);
		list.insertFirst(17);
		list.insertFirst(12);
		list.insertFirst(7);
		list.insertFirst(7);
		list.display();
//		list.insertLast(25);
		list.display();
//		System.out.println(list.size);
		list.insert(10, 2);
//		list.display();
//		list.deleteLast();
//		list.display();
//		list.delete(3);
		list.display();
//		list.insertUsingRecursion(100, 3, list.head);
		list.insert(10, 2);
		list.insert(10, 2);
		list.insert(10, 2);
		list.insert(10, 2);
		list.insert(10, 2);
		list.display();
		list.removeDuplicates();
		list.display();
		
		
//		DoublyLinkedList list = new DoublyLinkedList();
		
		/*
		 * list.insertFirst(12); list.insertFirst(23); list.insertFirst(13);
		 * list.display(); System.out.println(list.size); list.insertLast(05);
		 * list.insert(13, 100); list.display();
		 */
//		list.insertUsingRecursion
		
		
		LinkedList list1=new LinkedList();
		
		LinkedList list2=new LinkedList();
		
		list1.insertLast(1);
		list1.insertLast(1);
		list1.insertLast(2);
		list2.insertLast(1);
		list2.insertLast(4);
		list2.insertLast(5);
		list2.insertLast(9);
		list2.insertLast(12);
		
		LinkedList ans = new LinkedList();
		ans= ans.mergeSortedLists(list1, list2);
		
		ans.display();

	}
	
	
}
