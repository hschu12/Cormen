import java.util.Random;

public class Test{
	
	public static void main(String[] args){
		//Test decresing order
		BubbleSort bs = new BubbleSort();
		for (int i = 100; i > 0  ; i--) {
			bs.add(i);
		}
		bs.sort();
		System.out.println(bs.verify());

		//Test no input
		BubbleSort bs1 = new BubbleSort();
		bs1.sort();
		System.out.println(bs1.verify());

		//Test no input
		BubbleSort bs2 = new BubbleSort();
		Random rand = new Random();
		for (int i = 100; i > 0  ; i--) {
			bs2.add(rand.nextInt());
		}
		bs2.sort();
		System.out.println(bs2.verify());

	}

}