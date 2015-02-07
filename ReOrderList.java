
public class ReOrderList {
	 
	  public ListNode reverseKGroup(ListNode head, int k) {
	        if(head==null)
	            return head;
	        ListNode temp,nTemp,start,newHead=null;
	        ListNode pTemp = null;
	        ListNode ctr, link=null;
	        int size = getLength(head);
	        if(k==1)
	        {
	        	ListNode a = head;
	        	ListNode b = head;
	        	while(b.next!=null)
	        	{
	        		b=b.next;
	        	}
	        	ListNode result = reverseList(a,b);
	        	return result;
	        }
	        if(k>=size)
	            return head;
	        int iterationCount = size/k;
	        int c = 1;
	        temp = head;
	        while(c<=iterationCount)
	        {
	            start = temp;
	            int j = 1;
	            while(j<k)
	            {
	                pTemp = temp;
	                temp=temp.next;
	                j++;
	            }
	            nTemp = temp.next;
	            if(newHead==null)
	            {
	                newHead = reverseList(start,temp);
	                ctr = newHead;
	                while(ctr.next!=null)
	                {
	                    ctr=ctr.next;
	                }
	                ctr.next=nTemp;
	                link=ctr;
	            }
	            else
	            {
	                link.next = reverseList(start,temp);
	                ctr = link.next;
	                while(ctr.next!=null)
	                {
	                    ctr=ctr.next;
	                }
	                ctr.next = nTemp;
	                link = ctr;
	            }
	            c++;
	            temp=nTemp;
	        }
	        
	        return newHead;
	    }
	    
	    public ListNode reverseList(ListNode start, ListNode end)
	    {
	    	
	        ListNode x = start;
	        ListNode px = null;
	        ListNode fx= start.next;
	        end.next = null;
	        if(fx.next==null)
	        {
	        	fx.next=start;
	        	start.next=null;
	        	return fx;
	        }
	        while(x!=null)
	        {
	            x.next = px;
	            px=x;
	            x=fx;
	            if(fx==null)
	            	break;
	            fx=fx.next;
	        }
	        return px;
	    }
	    
	    public int getLength(ListNode head)
	    {
	        ListNode temp = head;
	        int count=0;
	        while(temp!=null)
	        {
	            temp=temp.next;
	            count++;
	        }
	        return count;
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReOrderList l = new ReOrderList();
		ListNode a1 = new ListNode(1);
		ListNode a2 = new ListNode(2);
		ListNode a3 = new ListNode(3);
		ListNode a4 = new ListNode(8);
		ListNode a5 = new ListNode(4);
		ListNode a6 = new ListNode(6);
		ListNode a7 = new ListNode(5);
		a1.next = a2;
		a2.next=a3;
		a3.next=a4;
		a4.next=a5;
		a5.next=a6;
		a6.next=a7;
		a7.next=null;
		ListNode head = l.reverseKGroup(a1, 7);
		while(head!=null)
		{
			System.out.println(head.val + " ");
			head=head.next;
		}
		 
	}

}
