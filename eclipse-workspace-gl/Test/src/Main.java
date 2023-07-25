
public class Main {
	public static void main(String[] args) {
		Parent p = new Child();
		p.test();
//		Test test1 = new Test1();
//		syso(test1.var);
//		test1.parent();
//		Test1 t2 = new Test1();
//		syso(t2.var1);
//		System.out.println(p.var1);error
		Child c= new Child();
		System.out.println(c.var1);
		
		String name ="RakeshKumarGuru";
		String name1= new String("rakeshkumarguru");
		String name2 ="RakeshKumarGuru";
		String name3= new String("rakeshkumarguru");
		System.out.println(name==name2);//true
	    System.out.println(name.equals(name2));//true

	   System.out.println(name1==name3);//false
	   System.out.println(name1.equals(name3));//true
	}
}
