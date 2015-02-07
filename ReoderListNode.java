public class ReoderListNode {

	public static void reorderList(ListNode head) {
        if(head==null||head.next==null||head.next.next==null)
            return;
        
        ListNode slow, fast,secondHead;
        slow = fast = head;
        ListNode temp=null;
        while(fast!=null && fast.next!=null)
        {
        	temp=slow;
            fast = fast.next.next;
            slow= slow.next;
        }
        secondHead = slow;
        temp.next = null;
        temp=head;
        ListNode revList = reverseList(secondHead);
        ListNode fwd = temp.next;
        secondHead = revList;
        ListNode secondfwd = secondHead.next;
        while(temp.next!=null)
        {
            temp.next = secondHead;
            secondHead = secondHead.next;
            temp.next.next = fwd;
            temp=fwd;
            fwd=temp.next;
        }
        temp.next = secondHead;
        while(head!=null)
        {
        	System.out.print(head.val+ "  ");
        	head=head.next;
        }
    }
		
    public static ListNode reverseList(ListNode head){
        if(head==null || head.next==null)
            return head;
        
        ListNode prev = null;
        ListNode cur = head;
        ListNode follow = head.next;
        while(cur!=null && cur.next!=null)
        {
            cur.next=prev;
            prev = cur;
            cur = follow;
            follow = follow.next;
        }
        cur.next = prev;
        return cur;
    }

	public static void main(String[] args) {
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

		reorderList(x1);

	}

}
