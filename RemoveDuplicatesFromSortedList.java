
public class RemoveDuplicatesFromSortedList {
	
	 public ListNode deleteDuplicates(ListNode head) {
	        if(head==null)
	            return head;
	        ListNode fwd = head.next;
	        ListNode cur = head;
	        while(cur.next!=null)
	        {
	            if(cur.val==fwd.val)
	            {
	                while(fwd!=null)
	                {
	                    if(cur.val==fwd.val)
	                        fwd=fwd.next;
	                    else
	                    	break;
	                }
	                cur.next=fwd;
	            }
	            else
	            {
	                cur=fwd;
	                fwd=fwd.next;
	            }
	            
	        }
	        return head;
	        
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RemoveDuplicatesFromSortedList l = new RemoveDuplicatesFromSortedList();
		ListNode a1 = new ListNode(1);
		ListNode a2 = new ListNode(1);
		ListNode a3 = new ListNode(3);
		a1.next = a2;
		a2.next=a3;
		a3.next=null;
		
		
		ListNode head = l.deleteDuplicates(a1); 
		
		while(head!=null)
		{
			System.out.println(head.val + " ");
			head=head.next;
		}
	}

}
