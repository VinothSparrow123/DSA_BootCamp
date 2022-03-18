package LinkedList;

public class LinkedList {
	
	
	public Node head;
	public Node tail;
	public int size;
	
	public LinkedList() {
		this.size = 0;
	}
	
	public void insertFirst(int value) {
		Node node=new Node(value);
		node.next = head;
		head = node;
		
		if(tail == null) {
			tail=head;
		}
		size++;
	}
	
	public void display() {
		Node node = head;
		while(node != null) {
			System.out.print(node.value + " -> ");
			node=node.next;
		}
		
		System.out.println("END");
	}
	
	public void insertLast(int value) {
		if(tail == null) {
			insertFirst(value);
			return;
		}
		Node node = new Node(value);
		tail.next = node;
		tail = node;
		size++;
	}
	
	public void insert(int value,int index) {
		if(index == 0) {
			insertFirst(value);
			return;
		}
		if(index == size) {
			insertLast(value);
			return;
		}
		
		Node temp = head;
		for (int i = 1; i < index; i++) {
			temp=temp.next;
		}
//		Node temp1=temp.next;
//		temp.next = node;
//		node.next = temp1;
		Node node = new Node(value, temp.next);
		temp.next = node;
		size++;
	}
	
	public int deleteFirst() {
		int value = head.value;
		head = head.next;
		if(head == null) {
			tail = null;
		}
		size--;
		
		return value;
	}
	
	
	public int deleteLast() {
		
		if(size <=1) {
			return deleteFirst();
		}
        Node secondLast = get(size - 2);
        Node t = tail;
        int val = tail.value;
        tail = secondLast;
        tail.next = null;
        size--;
        return val;
	}
	
	public int delete(int index) {
		
		if(index ==0) {
			return deleteFirst();
		}
		
		if(index ==size-1) {
			return deleteLast();
		}
		
		Node node=get(index-1);
		int deletedValue = node.next.value;
		node.next = node.next.next;
		size--;
		return deletedValue;
	}
	
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
	
	public Node get(int index) {
		Node temp=head;
		for (int i = 0; i < index; i++) {
			temp = temp.next;
		}
		return temp;
	}
	
	private class Node{
		private int value;
		private Node next;
		
		public Node(int value) {
			this.value=value;
		}
		
		public Node(int value, Node next) {
			this.value = value;
			this.next = next;
		}
	}
}
