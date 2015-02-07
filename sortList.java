public class sortList {

	public static ListNode sortList(ListNode head) 
    {
        if(head==null||head.next==null)
        {
            return head;
        }
        
        ListNode middle = splitList(head);
        ListNode firstList = head;
        ListNode secondList = middle.next;
        middle.next = null;
        ListNode first = sortList(firstList);
        ListNode second = sortList(secondList);
        ListNode mergedArray = mergeList(first,second);
        return mergedArray;
    }
    
    public static ListNode splitList(ListNode head)
    {
    	ListNode prevSlow = null;
        if(head==null||head.next==null)
            return head;
        ListNode slow = head;
        ListNode fast = head;
        
        while(fast!=null && fast.next!=null)
        {
        	prevSlow = slow;
            slow=slow.next;
            fast=fast.next.next;
            }
        
        return prevSlow;
        
    }
    
    public static ListNode mergeList(ListNode first, ListNode second)
    {
        if(first==null)
            return second;
        if(second==null)
            return first;
        
        if(first.val<second.val)
        {
            first.next = mergeList(first.next,second);
            return first;
        }
        else
        {
            second.next = mergeList(second.next,first);
            return second;
        }
    }

	public static void main(String[] args) {
		ListNode x1 = new ListNode(2);
		ListNode x2 = new ListNode(1);
		/*ListNode x3 = new ListNode(5);
		ListNode x4 = new ListNode(4);
		ListNode x5 = new ListNode(2);
		ListNode x6 = new ListNode(6);*/
		x1.next = x2;
		x2.next = null;
		/*x3.next = x4;
		x4.next = x5;
		x5.next = x6;
		x6.next = null;*/
		ListNode r = sortList(x1);
		
		while(r!=null)
		{
			System.out.print(r.val+ " ");
			r=r.next;
		}
	}

}
