package chapter1;

public class PhraseOMatic {
	
	
	
	public static void main (String [] args) {
		
		// Создаем три набора слов 
		
		String [] wordListOne = {"круглосуточный" , "трех-звенный" , "3000 - футовый", 
				"взаимный","обоюдный выигрыш", "фронтэнд", "на основе веб-технологий", 
				"проникающий", "умный","шесть сигм", "метод критического пути", "динамичный"};
		
		String [] wordListTwo = {"уполномоченный", "трудный", "веселый", "практичный", "целеустремленный",
				"чистый продукт", "ориентированный", "центральный", "распределенный",
				"кластеризированный", "фирменный", "нестадартный ум", "позиционированный",
				"сетевой",  "сфокусированный", "использованный с выгодой", "выровненный",
				"нацеленный на", "общий", "совместный", "ускоренный"};
		
		String [] wordListThree = {"процесс", "пункт разгрузки", "выход из положения",
				"тип структуры", "талант", "подход","уровень завоеванного внимания",
				"портал", "период времени", "обзор", "образец", "пункт следования"};
		
		// Вычисляем сколько слов в каждом списке
		int oneLength = wordListOne.length;
		int twoLength = wordListTwo.length;
		int threeLength = wordListThree.length;
		
		// Генерируем три случайных числа
		int rand1 = (int) (Math.random()* oneLength);
		int rand2 = (int) (Math.random()* twoLength);
		int rand3 = (int) (Math.random()* threeLength);
		
		// Теперь строим фразу
		String phrase = wordListOne[rand1] + " " + wordListTwo[rand2] + " " + wordListThree[rand3];
		System.out.println("Все, что нам нужно - это " + phrase);
		 
		// Определяем длинну 3-го массива слов
		int x = wordListThree.length;
		 System.out.println(x);
		 
		 // Личный експеримент перебор и вывод на экран строкового массива
		 String [] pets = {"Барсик", "Шарик", "Тузик"};
		 String s = pets[0];
		 
		 System.out.println("Этого пса зовут - " + s + "!");
		 
		 for (int i = 0; i < 3; i++) {
			 System.out.println(pets[i]);
	}
		 
}
}
