
public class ReverseLinkedList2 {
	public ListNode reverseBetween(ListNode head, int m, int n) {
        int diff = n-m;
        if(diff==0)
            return head;
        ListNode beforeRev = head;
        ListNode temp = head;
        if(m>1)
        {
            int count = 1;
            while(count<m)
            {
                beforeRev = temp;
                temp = temp.next;
                count++;
            }
        }
        ListNode befTemp;
        /*if(m==1)
        {
            befTemp = null;
        }
        else
        {
            befTemp = beforeRev;
        }*/
        befTemp = null;
        ListNode aftTemp = temp.next;
        while(diff>=0)
        {
            temp.next=befTemp;
            befTemp = temp;
            temp=aftTemp;
            if(aftTemp==null)
            {
                break;
            }
            aftTemp = aftTemp.next;
            diff--;
        }
        if(diff>0)
        {
            aftTemp.next = temp;
            temp.next = null;
            befTemp.next = aftTemp;
        }
        if(m==1)
        {
        	head=befTemp;
        	while(befTemp.next!=null)
        		befTemp = befTemp.next;
        	befTemp.next = temp;
            return head;
        }
        else
        {
        	beforeRev.next = befTemp;
        	ListNode x = befTemp;
        	while(x.next!=null)
        		x= x.next;
        	x.next = temp;
            return head;
        }
    }
	public static void main(String[] args) {
		ReverseLinkedList2 r = new ReverseLinkedList2();
		ListNode a1 = new ListNode(1);
		ListNode a2 = new ListNode(2);
		ListNode a3 = new ListNode(3);
		a1.next = a2;
		a2.next = a3;
		a3.next=null;
		ListNode result = r.reverseBetween(a1, 1, 3);
		while(result!=null)
		{
			System.out.println(result.val + " ");
			result=result.next;
		}
	}

}
