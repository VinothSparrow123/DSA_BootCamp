package LinkedList;

public class DoublyLinkedList {
	
	public Node head;
	public Node tail;
	public int size;
	
	public DoublyLinkedList() {
		size = 0;
	}
	
	public void insertFirst(int value) {
		Node node = new Node(value);
		if(head == null) {
			head = node;
			tail = head;
			size++;
			return;
		}
		
		node.next = head;
		node.prev = null;
//		if(head != null) {
//			head.prev = node;
//		}
		head.prev = node;
		head = node;
		size++;
	}
	
	public void display() {
		Node node = head;
		Node last = null;
		while(node!= null) {
			System.out.print(node.value+" -> ");
			last = node;
			node = node.next;
		}
		
		System.out.print("END");
		
		while(last!= null) {
			System.out.print(last.value+" -> ");
			last = last.prev;
		}
		
		System.out.print("END");
		
	}
	
	public void insertLast(int value) {
		Node node = new Node(value);
		Node last = head;
		while(last.next != null) {
			last = last.next;
		}
		last.next = node;
		node.prev = last;
		node.next = null;
		last = node;
	}
	
	/*
	 * public void insert(int value, int prevValue) { Node node = new Node(value);
	 * Node previ = head; while(previ.value != prevValue) { previ = previ.next; }
	 * 
	 * node.next = previ.next; previ.next.prev =node; previ.next = node;
	 * node.prev=previ;
	 * 
	 * }
	 */
	
	public Node find(int value) {
        Node node = head;
        while (node != null) {
            if (node.value == value) {
                return node;
            }
            node = node.next;
        }
        return null;
    }
	
	public void insert(int after, int val) {
        Node p = find(after);

        if (p == null) {
            System.out.println("does not exist");
            return;
        }

        Node node = new Node(val);
        node.next = p.next;
        p.next = node;
        node.prev = p;
        if (node.next != null) {
            node.next.prev = node;
        }
    }
	
	private class Node{
		int value;
		Node next;
		Node prev;
		
		public Node(int value) {
			this.value = value;
		}
		
		public Node(int value, Node next) {
			this.value = value;
			this.next = next;
		}
		
		public Node(int value, Node next, Node prev) {
			this.value = value;
			this.next = next;
			this.prev = prev;
		}
	}
}
