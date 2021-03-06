
public class Singly_linked_list_deleteFirst_deleteLast_deleteSpecificPosition {

	 private void display(node head) {
	        node current = head;
	        if(current == null){
	            return;
	        }
	        while(current!=null){
	            System.out.print(current.value+"-->");
	            current=current.next;
	        }
	        System.out.println(current);
	    }
	    
	    private static class node{
	        private int value;
	        private node next;
	        public node(int data){
	            value = data;
	            this.next = null;
	        }
	    }
	    public node deleteHead(node head){
	        node Top = head;
	        head = head.next;
	        Top.next = null;
	        return head;
	    }
	    public node deleteTail(node head){
	        node current = head;
	        node deleteNode = null;
	        
	        while(current.next != null) {
	        	deleteNode = current;
	        	current = current.next;
	        }
	        deleteNode.next = null;
	        return head;
	    }
	     public node deletePosition(node head,int position){
	        node privious = head;
	        
	        if(position == 0){
	            return head.next;
	        }
	        int count = 0;
	        while(count < position-1){
	            privious = privious.next;
	            count ++;
	        }
	        node DeleteNode = privious.next;
	        privious.next = DeleteNode.next;
	        DeleteNode.next = null;
	        
	        return head;
	    }
	    public static void main(String[] args) {
	        Singly_linked_list_deleteFirst_deleteLast_deleteSpecificPosition ob = new Singly_linked_list_deleteFirst_deleteLast_deleteSpecificPosition();
	        
	        node head = new node(1);
	        node second = new node(2);
	        node third = new node(3);
	        
	        head.next = second;
	        second.next = third;
	        
	        ob.display(head);
	        
	        node Node = ob.deleteHead(head);
	        ob.display(Node);
	        
	        node deletelast = ob.deleteTail(Node);
	        ob.display(deletelast);
	        
	        node deleteposition = ob.deletePosition(head,0);
	        ob.display(deleteposition);
	    }

}
