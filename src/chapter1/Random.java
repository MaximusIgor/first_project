package chapter1;

public class Random {
	public static void main (String [] args) {
		
// Обьявляем массив чисел размером в 9 чисел		
		int [] num = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		//int [] num = {9};
// Переобразовываем массив в массив длины строки чисел		
		int numLength = num.length;
		//int numLength = num.length;
		
		
// Обьявляем переменную one которая с помощью Класса Math и метода random определяют случайное число из массива
		int one = (int) (Math.random() * numLength);

// Выводим на экран случайное число		
		System.out.println(one);

}
}
