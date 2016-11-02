
public class Test{
	
	public static void main(String[] args){
		InsertionSort is = new InsertionSort();
		for (int i = 100; i > 0  ; i--) {
			is.insert(i);
		}
		is.sort();
		is.print();
	}
}