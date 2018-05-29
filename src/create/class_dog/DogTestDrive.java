package create.class_dog;

public class DogTestDrive {
	public static void main (String [] args) {
		Dog d = new Dog(); // Cоздаем обьект класса Dog
		d.size = 40; // Устанавливаем значение поля size // Точка это оператор доступа к переменным и методам экземпляра
		d.bark(); // Вызываем метод bark
	}
}
