import java.util.*;
public class RemDup {
	private static final Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {

		LinkedList<Integer> ll = new LinkedList<>();
		
		System.out.println("Enter Linked List's size");
		System.out.print("Size : ");
		int size = sc.nextInt();
		System.out.println("Enter contents of Linked List");
		for (int i=0; i < size; i++) {
			System.out.print("["+i+"] : ");
			ll.add(sc.nextInt());
			System.out.println();
		}
		ll.sort();
		System.out.println("You Entered "+ll);
		ll.removeDuplicates(); // See Linked List.java
		// ll.add(6); // un-comment to see if linked list is still functional after removing duplicates....
		System.out.println("After removing Duplicates : "+ll);
	}

}
