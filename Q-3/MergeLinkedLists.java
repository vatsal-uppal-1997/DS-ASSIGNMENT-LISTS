import java.util.*;
public class MergeLinkedLists {

	private static final Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {

		LinkedList<Integer> ll1 = new LinkedList<>();
		LinkedList<Integer> ll2 = new LinkedList<>();
		
		System.out.print("Enter First Linked List size : ");
		int size1 = sc.nextInt();
		System.out.println();
		System.out.print("Enter Second Linked List size : ");
		int size2 = sc.nextInt();
		System.out.println("First Linked List : ");
		for (int i=0;i<size1;i++) { 
			System.out.print("["+i+"] : ");
			ll1.add(sc.nextInt());
			System.out.println();
		}
		System.out.println("Second Linked List : ");
		for (int i=0; i<size2; i++) {
			System.out.print("["+i+"] : ");
			ll2.add(sc.nextInt());
			System.out.println();		
		}

		System.out.println("Elements in First Linked List : "+ll1+"\n"+"Elements in Second Linked List : "+ll2);

		ll1.merge(ll2); // See LinkedList.java

		System.out.println("Elements after Merging First and Second Linked Lists : "+ll1);
		
	}

}
