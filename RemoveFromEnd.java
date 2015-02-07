
public class RemoveFromEnd {
	
	public static ListNode removeNthNodeFromEnd(ListNode head, int n)
	{
		if(head==null)
			return head;
		ListNode prev = null;
		ListNode prevRef = null;
		ListNode main = head;
		ListNode ref = head;
		for(int i=1;i<=n;i++)
		{
			prevRef=ref;
			ref = ref.next;
				
		}
				
		while(ref!=null)
		{
			ref=ref.next;
			prev=main;
			main = main.next;
		}
		
		if(ref==null && main == head)
		{
			head = null;
			return prevRef;
		}
		
		prev.next = main.next;
		
		return head;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode a1 = new ListNode(1);
		ListNode a2 = new ListNode(2);
		ListNode a3 = new ListNode(3);
		ListNode a4 = new ListNode(4);
		ListNode a5 = new ListNode(5);
		ListNode a6 = new ListNode(6);
		ListNode a7 = new ListNode(7);
		ListNode a8 = new ListNode(8);
		ListNode a9 = new ListNode(9);
		
		a1.next = a2;
		a2.next = a3;
		a3.next = a4;
		a4.next = a5;
		a5.next = a6;;
		a6.next = a7;
		a7.next = a8;
		a8.next = a9;
		a9.next = null;
		
		ListNode head = removeNthNodeFromEnd(a9,1);
		
		ListNode temp = head;
		
		while(temp!=null)
		{
			System.out.print(temp.val +" ");
			temp=temp.next;
		}
		
	}

}
