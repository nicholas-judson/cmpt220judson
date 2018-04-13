import java.util.ArrayList;

public class SortArrayList {

	public static void main(String[] args) {
		
		ArrayList<Number> list = new ArrayList<Number>();
		
	    list.add(14);
	    list.add(24);
	    list.add(4);
	    list.add(42);
	    list.add(5);
		
		System.out.println(" The unsorted list is: " + list.toString());
		
		sort(list);
		
		System.out.println(" The sorted array is " + list.toString());
	}
	
	public static void sort(ArrayList<Number> list) {
		int minimum;
		
		for(int i = 0; i < list.size() - 1; i++) {
			minimum = i;
			for(int j = i + 1; j < list.size(); j++) {
				if(list.get(minimum).intValue() > list.get(j).intValue()) {
					minimum = j;
				}
			}
			if(minimum != i) {
				Number temporary = list.get(minimum);
				list.set(minimum, list.get(i));
				list.set(i, temporary);
			}	
		}
		
	}

}

