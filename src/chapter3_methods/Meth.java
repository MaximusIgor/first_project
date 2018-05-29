package chapter3_methods;

public class Meth { 
	public static void main (String [] args) {
		
	}
	 void go() {
		 Meth t = new Meth();
		 int foo = 7;
		 int bar = 3;
		 t.takeTwo(foo, bar);
	 }
	 void takeTwo(int x, int y) {
		 int z  = x + y;
		 System.out.println("Total is - " + z); 
	 }
	 
}
