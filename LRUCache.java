import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class LRUCache {

	class Node {
		int key;
		int value;
		Node prev;
		Node next;

		Node(int key, int value) {
			this.key = key;
			this.value = value;
		}

	}

	HashMap<Integer, Node> m;
	Node head, tail;
	int capacity;

	public LRUCache(int capacity) {
		m = new HashMap<Integer, Node>();
		head = tail = null;
		this.capacity = capacity;
	}

	public int get(int key) {
		Node x = m.get(key);
		if (x == null)
			return -1;
		else {
			if (x == head)
				return x.value;
			else if (x == tail) {
				tail = tail.prev;;
				tail.next = null;
				x.next = head;
				head.prev =x;
				head = x;
				return x.value;
			} else {
				x.prev.next = x.next;
				x.next.prev = x.prev;
				x.prev = null;
				x.next = head;
				head.prev =x;
				head = x;
				return x.value;
			}
		}
	}

	public void set(int key, int value) {
		if(head==null)
		{
			Node a = new Node(key,value);
			head = tail = a;
			m.put(key, a);
			return;
		}
		if(m.get(key)==null)
		{
			Node a = new Node(key,value);
			if(m.size()==capacity)
			{
				int s = tail.key;
				tail.prev.next = tail.next;
				tail = tail.prev;
				m.remove(s);
				m.put(key, a);
				a.next = head;
				head.prev = a;
				head = a;
			}
			else
			{
				a.next = head;
				head.prev = a;
				head = a;
				m.put(key, a);
			}
		}
		else
		{
			Node a = m.get(key);
			a.value = value;
			if(a==head)
			{
				m.put(key,a);
				return;
			}
			if(a==tail)
			{
				tail=tail.prev;
				tail.next = null;
				a.prev = null;
				a.next = head;
				head.prev = a;
				head = a;
				m.put(key, a);
				return;
			}
			a.prev.next = a.next;
			a.next.prev = a.prev;
			a.prev= null;
			a.next = head;
			head.prev = a;
			head = a;
		}

	}
	
	public void printList()
	{
		Node temp = head;
		while(temp!=null)
		{
			System.out.print("("+temp.key+","+temp.value+")"+"----");
			temp = temp.next;
		}
		System.out.println("\n");
	}

	public static void main(String[] args) {
		
		LRUCache p = new LRUCache(3);
		p.set(1, 10);
		p.set(2, 20);
		p.set(3, 30);
		p.get(1);
		p.printList();
		p.set(1, 100);
		p.set(2, 45);
		p.printList();
		p.set(100, 5000);
		p.printList();
	}

}
