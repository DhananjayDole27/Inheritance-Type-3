package inheritance.type3;

public class Test1 {

	public static void main(String[] args) {
		
		B b = new B();
	 String s = (String) b.m3();
	 
	 String s1 = b.m4();
	 System.out.println(s);
	 System.out.println(s1);
	 
	// a.java file also connected to this test2.java. 
	  A a = new A();
	  int x = a.m1();
	  int y = (int) a.m2();
	 System.out.println(x);
	 System.out.println(y);

	}

}
