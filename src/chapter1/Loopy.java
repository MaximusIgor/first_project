package chapter1;

public class Loopy {
	public static void main (String [] args ) {
		int x = 1;
		System.out.println("Перед началом цикла значение х равно: " + x);
		
		while (x < 4) {
			System.out.println("Внутри цикла значение x равнo: " + x);
			x = x + 1;
		}
		System.out.println("После окончания цикла");
		
	}
}