
public class RotateList {

	public ListNode turnList(ListNode head, int n)
	{
		int len = getLength(head);
		
		if(len==0)
			return null;
		if(n>len)
			return null;
		if(n==0||n==len-1)
			return head;
		 ListNode temp = head;
	        for(int i=0;i<len-n-1;i++)
	        {
	            temp=temp.next;
	        }
	        
	        ListNode fwd = temp.next;
	        temp.next = null;
	        ListNode prev =null;
	        ListNode temp1 = fwd;
	        while(temp1!=null){
	            prev=temp1;
	            temp1=temp1.next;
	            
	        }
	        prev.next=head;
	        
	        head=fwd;
	        
	        return head;
	}
	
	public int getLength(ListNode head)
	{
		ListNode temp = head;
		int count = 0;
		while(temp!=null)
		{
			temp=temp.next;
			count++;
		}
		return count;
	}
	
	
	public static void main(String[] args) {
		RotateList a = new RotateList();
		ListNode x1 = new ListNode(1);
		ListNode x2 = new ListNode(2);
		ListNode x3 = new ListNode(3);
		ListNode x4 = new ListNode(4);
		ListNode x5 = new ListNode(5);
		ListNode x6 = new ListNode(6);
		ListNode x7 = new ListNode(7);
		x1.next = x2;
		x2.next = x3;
		x3.next = x4;
		
		x4.next = x5;
		x5.next = x6;
		x6.next = x7;
		x7.next=null;
		
		ListNode result = a.turnList(x1, 2);
		
		while(result!=null)
		{
			System.out.print(result.val + " ");
			result= result.next;
		}

	}

}
