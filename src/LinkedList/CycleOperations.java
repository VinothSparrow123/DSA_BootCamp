package LinkedList;

public class CycleOperations {
	public boolean hasCycle(ListNode head) {
        /*Fast and Slow pointers - Use when you need to work on cycle or reverse cycle linkedlist
        Slow pointer moves to next node for each iteration
        Fast pointer moves 2 nodes which is one node faster thanslow node
        */
        ListNode slow = head;
        ListNode fast= head;
       
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast=fast.next.next;
            
            if(slow == fast ){
                return true;
            }
            
        }
        
        return false;
    }
	
	public int cycleLength(ListNode head) {
        /*Fast and Slow pointers - Use when you need to work on cycle or reverse cycle linkedlist
        Slow pointer moves to next node for each iteration
        Fast pointer moves 2 nodes which is one node faster thanslow node
        */
        ListNode slow = head;
        ListNode fast= head;
       
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast=fast.next.next;
            if(slow == fast) {
            	int length = 0;
            	do {
                	slow=slow.next;
                	length++;
                }while(slow != fast);
            	
            	return length;
            }
            
//            if(slow == fast ){
//                return length(fast, slow);
//            }
            
        }
        
        return -1;
    }
	
	public int length(ListNode fast, ListNode slow) {
		int length=1;
		slow = slow.next;
		while(slow!= fast) {
			length++;
		}
		return length;
	}
	
	class ListNode {
		 int val;
		 ListNode next;
		 ListNode(int x) {
		 val = x;
		 next = null;
		 }
	}
}
