package practice;

import java.util.HashMap;
import java.util.Hashtable;

public class A {
//	  private String name;
//	    private int id;
//	    
//	    // Constructor, getters, setters, etc.
//
//	    @Override
//	    public int hashCode() {
//	        int prime = 31;
//	        int result = 10;
//	        result = prime * result + id;
//	        result = prime * result + ((name == null) ? 0 : name.hashCode());
//	        return result;

	public static void main(String[] args) {
		String str= new String("Rakesh");
		String str1= new String("Rakesh");
		String str2= "Rakesh";
		System.out.println(str == str1);
		System.out.println(str1 == str2);
//		((NamePrinter) (name) -> System.out.println(name)).printName("John Doe");
		HashMap<Integer, String> list= new HashMap<>();
//		Hashtable<Integer, String> list= new Hashtable<>();
		list.put(null, "Rakesh");
		System.out.println(list);
    
//		System.out.println(str.equals(str1));
//		A a= new A();
//		a.hashCode();
//		a.id= 10;
//		a.name= "Rakesh";
////		System.out.println(a);
//		System.out.println(a.toString());
		
	}
}
