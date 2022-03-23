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
	
	public Node insertUsingRecursion(int value, int index, Node currNode) {
		if(index ==0) {
			Node node = new Node(value, currNode);
			size++;
			return node;
		}
		currNode.next = insertUsingRecursion(value, index-1, currNode.next);
		return currNode;
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
	
	public void removeDuplicates() {
		Node temp=head;
        while(temp.next != null){
            if(temp.value == temp.next.value){
                temp.next = temp.next.next;
                size--;
            }else{
                temp = temp.next;
            }
        }
        tail = temp;
        tail.next = null;
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
	
	public LinkedList mergeSortedLists(LinkedList list1, LinkedList list2) {
		Node f=list1.head;
		Node s=list2.head;
		
		LinkedList ans = new LinkedList();

        while(f != null && s !=null){
            if(s.value > f.value){
                ans.insertLast(f.value);
                f=f.next;
            }else{
            	ans.insertLast(s.value);
                s=s.next;
            }
        }
        
        while(f != null) {
        	ans.insertLast(f.value);
            f=f.next;
        }
        
        while(s != null) {
        	ans.insertLast(s.value);
            s=s.next;
        }
        
		return ans;
	}
	
	public static LinkedList mergeSortedLists1(LinkedList list1, LinkedList list2) {
		Node f=list1.head;
		Node s=list2.head;
		
		LinkedList ans = new LinkedList();

        while(f != null && s !=null){
            if(s.value > f.value){
                ans.insertLast(f.value);
                f=f.next;
            }else{
            	ans.insertLast(s.value);
                s=s.next;
            }
        }
        
        while(f != null) {
        	ans.insertLast(f.value);
            f=f.next;
        }
        
        while(s != null) {
        	ans.insertLast(s.value);
            s=s.next;
        }
        
		return ans;
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
