import java.util.*;

// Creating all linked list functions once and will reuse this along all the assignment questions

public class LinkedList <T extends Comparable<T>> {
	
	class Node implements Comparable<Node> {

		private T data;
		private Node next;

		Node(T data, Node next) {
			this.data = data;
			this.next = next;
		}

		T getData() {
			return this.data;
		}

		Node getNext() {
			return this.next;
		}
		
		void setData(T data) {
			this.data = data;
		}

		void setNext(Node next) {
			this.next = next;
		}

		public int compareTo(Node compare) {
		
			if (this.getData().compareTo(compare.getData()) > 0)
				return 1;
			else if (this.getData().compareTo(compare.getData()) < 0)
				return -1;
			else
				return 0;
		}

	}

	Node start, tail;
	int size;

	public LinkedList() {
		this.start = null;
		this.tail = null;
		this.size = -1;
	}

	public void removeDuplicates() {
		Node temp = this.start;
		Node move;
		while (temp != null) {
			move = temp;
			while ( move.getNext() != null && move.getData() == (move.getNext()).getData() )
				// Make the reference 'move' refer to the next repeating element unless a unique element is encountered after the unique element
					move = move.getNext();
		
			if (move != temp) {
				if (move.getNext() == null) { // There exists no unique node till the end of the Linked List
					temp.setNext(null);
					this.tail = temp; // *IMPORTANT* RE-ADJUST THE DAMN TAIL !
					break;
				} else {
					temp.setNext(move.getNext()); // There is a unique node after move
				}
			}
			temp = temp.getNext();
		}
	}

	public void add(T data) {
		
		Node temp = new Node(data,null);
		if (this.start == null)
			this.start = temp;
		else
			this.tail.setNext(temp);
		this.tail = temp;

	}
	
	public int size() {
		Node temp = this.start;
		int sz = 0;
		while (temp != tail) {
			temp = temp.getNext();
			sz++;
		}
		sz += 1;
		return sz;
	}

	public T get(int index) {
		Node temp = this.start;
		int idx = 0;
		while (idx != index) 
			if (temp != null) {
				temp = temp.getNext();
				idx++;
			} else {
				return null;
			}
		return temp.getData(); 
	}

	public void reverse() {
		Node setNext = null; // null initially because we want to set stat null
		Node oldNext = this.start.getNext(); // Store the old next so we can change current next
		Node moveForward = this.start; // move forward :p

		while (oldNext != null ) {
			oldNext = moveForward.getNext();
			moveForward.setNext(setNext);
			setNext = moveForward;
			moveForward = oldNext;
		}

		// swap tail and start
		moveForward = this.start; // Using moveforward as temp
		this.start = this.tail;
		this.tail = moveForward;
	}

	public void sort() {
		// Bubble Sort
		Node temp;
		this.size = size();
		for (int i=0; i < this.size; i++) {
			temp = this.start;
			for (int j=0; j < this.size-i-1; j++) {
				if (temp.compareTo((temp.getNext())) > 0) {
					swap(temp, temp.getNext()); 				
				}
				temp = temp.getNext();
			}
		}			
	}
	
	public void swap(int index1, int index2) {		
		Node a = getNode(index1);
		Node b = getNode(index2);
		T temp = a.getData();
		a.setData(b.getData());
		b.setData(temp);
	}

	public void insertBefore(int index, T data) {		
		if (index == 0)	{
			Node temp = new Node(data,this.start);
			this.start = temp;
		}	
		Node atIndex = getNode(index);
		Node previous = getPrevious(atIndex);
		Node temp = new Node(data, atIndex);
		previous.setNext(temp);	
	}

	public void insertAfter(int index, T data) {
		Node atIndex = getNode(index);
		Node temp = new Node(data, atIndex.getNext());
		atIndex.setNext(temp);
	}

	public void remove(int index) {
		if (index == 0) {
			this.start = this.start.getNext();
			return;
		}
		Node toDelete = getNode(index);
		Node previous = getPrevious(toDelete);
		previous.setNext(toDelete.getNext());
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append('[');
		Node temp = this.start;
		while (temp.getNext() != null) {
			sb.append(temp.getData()).append(',').append(' ');
			temp = temp.getNext();
		}
		sb.append(temp.getData()).append(']');
		return sb.toString();
	}

	private Node getNode(int index) {
		Node temp = this.start;
		int idx = 0;
		while (idx != index) 
			if (temp != null) {
				temp = temp.getNext();
				idx++;
			} else {
				return null;
			}
		return temp; 
	}

	private Node getPrevious(Node n) {
		Node temp = this.start;
		Node prev = null;
		while (temp != n)
			if (temp != null) {
				prev = temp;
				temp = temp.getNext();
			} else {
				break;
			}
		return prev; 
	}

	private void swap(Node a, Node b) { 
		T temp = a.getData();
		a.setData(b.getData());
		b.setData(temp);
	}	
}
