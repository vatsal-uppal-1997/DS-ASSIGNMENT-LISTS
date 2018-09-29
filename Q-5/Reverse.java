import java.util.Scanner;

public class Reverse {

	private static final Scanner sc = new Scanner(System.in);

	public static void main (String[] args) {

		LinkedList<Integer> ll1 = new LinkedList<>();
		
		System.out.print("Size : ");
		int size = sc.nextInt();
		System.out.println();
		for (int i=0; i < size; i++) {
			System.out.print("["+i+"] : ");
			ll1.add(sc.nextInt());
			System.out.println();
		}
		
		ll1.reverse();
		System.out.println("Linked List Reversed "+ll1);

	}

}
