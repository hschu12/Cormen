import java.util.ArrayList;

public class BubbleSort{
	
	private ArrayList<Integer> list;

	BubbleSort() {
		list = new ArrayList<>();
	}

	public void add(int i){
		list.add(i);
	}

	public void sort(){
		for (int i = 0; i < list.size(); i++) {
			for (int j = list.size()-1; j > i; j--) {
				if (list.get(j) < list.get(j-1)) {
					int temp = list.get(j);
					list.set(j, list.get(j-1));
					list.set(j-1, temp);
				}
			}
		}
	}

	public boolean verify(){
		for (int i = 0; i < list.size()-1 ; i++) {
			if(list.get(i) > list.get(i+1)) {
				return false;
			}
		}
		return true;
	}

	public void print(){
		for (int i = 0; i < list.size() ; i++) {
			System.out.print(list.get(i) + ", ");
		}
		System.out.println();
	}
}