package chapter1;

public class IfTest2 {
	public static void main (String [] args) {
		int x = 2;
		for (x = 1; x < 5; x++) {
			System.out.println(x);
		
		if (x == 3) {
			System.out.println("х должен быть равен 3");
		}
		else {
			System.out.println("х не равен 3");
		}
		
		System.out.println("Эта строка выполниться в любом случае");
		}
	}

}
