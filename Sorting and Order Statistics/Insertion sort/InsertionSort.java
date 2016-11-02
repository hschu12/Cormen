import java.util.ArrayList;

public class InsertionSort{
	
	ArrayList<Integer> list;

	public InsertionSort(){
		list = new ArrayList<Integer>();
	}

	public void insert(int i) {
		list.add(i);
	}

	public void sort(){
		int j, i;
		for (j = 1; j < list.size(); j++) {
			int key = list.get(j);
			i = j-1;
			while ( i >= 0 && list.get(i) > key) {
				list.set(i+1, list.get(i));
				i = i-1;
			}			
			list.set(i+1, key);
		}

	}

	public void print(){
		for (int i = 0; i < list.size() ; i++) {
			System.out.print(list.get(i) + ", ");
		}
		System.out.println();
	}
}