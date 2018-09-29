import java.util.*;

class Sorter <T extends Number> implements Comparator<T> {
	public int compare(T obj1, T obj2) {
		if (obj1.intValue()%(Integer)2 == 0)
			return 1;
		else
			return -1;
	}
}

public class OddFirst {

	private static final Scanner sc = new Scanner(System.in);

	public static void main(String []args) {
		LinkedList<Integer> ll1 = new LinkedList<>();
		
		System.out.print("Size : ");
		int size = sc.nextInt();
		System.out.println();
		for (int i=0; i < size; i++) {
			System.out.print("["+i+"] : ");
			ll1.add(sc.nextInt());
			System.out.println();
		}
		ll1.sort(); // Sort in ascending orde
		ll1.sort(new Sorter<Integer>()); // Sort according to Comparator Sorter
		System.out.println("Array : "+ll1);
	}

}

