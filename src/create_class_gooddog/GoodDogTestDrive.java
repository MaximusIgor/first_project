package create_class_gooddog;

public class GoodDogTestDrive {
	public static void main (String [] args) {
		GoodDog one = new GoodDog();
		one.setSize(80);
		
		GoodDog two = new GoodDog();
		two.setSize(8);
		
		System.out.println("������ ������: " + one.getSize());
		System.out.println("������ ������: " + two.getSize());
		one.bark();
		two.bark();
	}

}
