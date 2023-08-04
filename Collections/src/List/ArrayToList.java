package List;
import java.util.*;
public class ArrayToList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Creating Array 
		String[] array={"Java","Python","PHP","C++"}; 
		
		System.out.println("Printing Array: "+Arrays.toString(array)); 
		
		//Converting Array to List 
		
		List<String> list=new ArrayList<String>(); 
		
		for(String lang:array){ 
		 list.add(lang); 
		} 
		System.out.println("Printing List: "+list);
		
		
		// converting List to Array
		List<String> fruitList = new ArrayList<>(); 
		fruitList.add("HTML"); 
		fruitList.add("Java"); 
		fruitList.add("CSS"); 
		fruitList.add("JavaScript"); 
		//Converting ArrayList to Array 
		
		String[] array1 = fruitList.toArray(new String[fruitList.size()]); 
		
		System.out.println("Printing Array: "+Arrays.toString(array1)); 
		System.out.println("Printing List: "+fruitList);
		
		
		 System.out.println("Returning element: "+fruitList.get(1));
		 fruitList.set(3,"ReactJS");
		 
		 System.out.println("Printing List: "+fruitList);
		 
		 Collections.sort(fruitList);
		 System.out.println("After Sorting: "+fruitList);
		 
		 
		 ListIterator<String> itr=fruitList.listIterator();
		 System.out.println("Traversing elements in forward direction"); 
		 while(itr.hasNext())
		 { 
		 
		 System.out.println("index:"+itr.nextIndex()+" value:"+itr.next()); 
		 } 
		 System.out.println("Traversing elements in backward direction"); 
		 while(itr.hasPrevious())
		 { 
		 		 System.out.println("index:"+itr.previousIndex()+" value:"+itr.previous()); 
		 }
		 
		 // Remove
		 fruitList.remove("CSS");
		 System.out.println("After invoking remove(object) method: "+fruitList); 
		 fruitList.remove(2);
		 System.out.println("After invoking remove(index) method: "+fruitList); 
		 
		 ArrayList<String> al2=new ArrayList<String>(); 
		 al2.add("Spring Boot"); 
		 al2.add("MongoDB"); 
		 al2.add("MySQL"); 
		 al2.add("MongoDB");
		 al2.add("MongoDB");
		 al2.add("MongoDB");
		//Adding new elements to array list 
		 fruitList.addAll(al2); 
		 System.out.println("Updated list : "+fruitList);
		 
		//Removing elements on the basis of specified condition
		 fruitList.removeIf(str -> str.contains("MongoDB")); //Here, we are using Lambda expression 
		 
		 System.out.println("After invoking removeIf() method: "+fruitList);
		
		 
		//Removing all the new elements from array list
		fruitList.removeAll(al2);
		System.out.println("After invoking removeAll() method: "+fruitList);
		
		
		//Removing all the elements available in the list
		fruitList.clear();
		System.out.println("After invoking clear() method: "+fruitList); 
		 
	}

}
