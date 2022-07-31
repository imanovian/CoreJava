package collection;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] array1 = {"abc","dfg"};
		ArrayList<String> list1 = new ArrayList<String>();
		list1.add("john");
		list1.add("leeana");
		list1.add("rahman");
		list1.add("imran");
		list1.add("jiha");
		System.out.println("The list is: "+ list1);
		System.out.println("The list size is "+ list1.size());
		list1.remove(1);
		System.out.println("The list is: "+ list1);
		System.out.println("The list size is "+ list1.size());
		System.out.println("The thirs person is "+ list1.get(2));
		list1.add(0,"james");
		System.out.println("The list is: "+ list1);
		Collections.sort(list1);
		System.out.println("list after sort: "+ list1);
		for(int index=0; index<list1.size() ; index ++) {
			System.out.println(list1.get(index));
		}
		for(String name:list1){
			System.out.println(name);
		
		}
		for(int index=0; index<list1.size() ; index ++) {
			if(list1.get(index).equals("imran")){
	            System.out.println(index);
	            break;
			}

		}
	}

}
