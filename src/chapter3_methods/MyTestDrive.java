package chapter3_methods;

public class MyTestDrive {
	
	public static void main (String [] args) {
		My week = new My();
		week.age = 27;
		My week1 = new My ();
		week1.age = 28;
		int res;
		res = week.age * week1.age; 
		
		System.out.println(res);
		}
	
}
