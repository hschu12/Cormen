import java.util.Random;

public class Test{
	
	public static void main(String[] args){
		//Test decresing order
		InsertionSort is = new InsertionSort();
		for (int i = 100; i > 0  ; i--) {
			is.insert(i);
		}
		is.sort();
		System.out.println(is.verify());

		//Test no input
		InsertionSort is1 = new InsertionSort();
		is1.sort();
		System.out.println(is1.verify());

		//Test no input
		InsertionSort is2 = new InsertionSort();
		Random rand = new Random();
		for (int i = 100; i > 0  ; i--) {
			is2.insert(rand.nextInt());
		}
		is2.sort();
		System.out.println(is2.verify());

	}

}