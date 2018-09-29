import java.util.*;
public class Swap {
	private static final Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {

		final LinkedList<Integer> ll = new LinkedList<>();

		for (int i=0;i<10;i++)
			ll.add(i);
		int idx1, idx2;
		System.out.println("The current Linked List is ---> "+ll);
		System.out.println("Enter indexes to swap : ");
		System.out.print("Index 1 : ");
		idx1 = sc.nextInt();
		System.out.println();
		System.out.print("Index 2 : ");
		idx2 = sc.nextInt();
		ll.swap(idx1, idx2);
		System.out.println("After Swapping ---> "+ll);
	}

}
