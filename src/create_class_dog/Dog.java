package create_class_dog;

public class Dog {
	String name;
	public static void main (String [] args) {

// Создаем объект Dog и получаем к нему доступ 
		Dog dog1 = new Dog();
		dog1.bark();
		dog1.name = "Барт";
	
// Создаем массив типа Dog 
		Dog [] myDogs = new Dog[3];
		//int [] arr = new int [2];
// Поместим в него несколько элементов
		 myDogs[0] = new Dog();
		 myDogs[1] = new Dog();
		 myDogs[2] = dog1;
		 
//		 arr [0] = 7;
//		 arr [1] = 1;  
//		 arr [2] = 3;
//		 arr [3] = 1; Почему компилятор игнорирует то что я создал обьект массива с индексом 3 превишаеющим размер массива?
		 
	
// Получаем доступ к объектам 	Dog с помощью ссылок из массива
		 myDogs[0].name = "Фред";
		 myDogs[1].name = "Джордж";
	
// хммм... какое имя у myDogs[2]? 
		 System.out.print("Имя последней собаки - ");
		 System.out.println(myDogs[2].name);
	
// Теперь переберем все эллементы массива и вызовем для каждого метод bark()
		
		 int x = 0;
		while ( x < myDogs.length) {
			 myDogs[x].bark();
			 x = x + 1;
			 
		 }
	}
	public void bark() {
		System.out.println(name + " сказал Гав!");
	}
	public void eat() {}
	public void chaseCat() {}
}

