
public class RemoveDuplicatesFromSortedList2 {

	public ListNode deleteDuplicates(ListNode head){
		if(head==null || head.next==null)
			return head;
		while(head.next!=null)
		{
			if(head.val!=head.next.val)
				break;
			
			int x = head.val;
			while(x==head.next.val)
			{
				head=head.next;
				if(head.next==null)
				{
					return head.next;
				}
			}
			head=head.next;
		}
		
		ListNode prevTemp = null;
		ListNode prevRpt =null;
		ListNode temp = head;
		while(temp.next!=null)
		{
			if(temp.val==temp.next.val)
			{
				int y = temp.val;
				while(y==temp.next.val)
				{
					temp=temp.next;
					if(temp.next==null)
					{
						prevTemp.next=null;
						return head;
					}
				}
				prevRpt.next=temp.next;
				prevTemp = prevRpt;
				temp=temp.next;
				continue;
			}
			prevTemp=temp;
			prevRpt = prevTemp;
			temp=temp.next;
		}
		
		return head;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		RemoveDuplicatesFromSortedList2 l = new RemoveDuplicatesFromSortedList2();
		ListNode a1 = new ListNode(1);
		ListNode a2 = new ListNode(2);
		ListNode a3 = new ListNode(3);
		ListNode a4 = new ListNode(3);
		ListNode a5 = new ListNode(4);
		ListNode a6 = new ListNode(4);
		ListNode a7 = new ListNode(5);
		a1.next = a2;
		a2.next=a3;
		a3.next=a4;
		a4.next=a5;
		a5.next=a6;
		a6.next=a7;
		a7.next=null;
		
		
		ListNode head = l.deleteDuplicates(a1); 
		
		if(head==null)
		{
			System.out.println("No List");
		}
		while(head!=null)
		{
			System.out.println(head.val + " ");
			head=head.next;
		}
	}

}
