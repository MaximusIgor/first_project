package create_class_dog;

public class Dog {
	String name;
	public static void main (String [] args) {

// ������� ������ Dog � �������� � ���� ������ 
		Dog dog1 = new Dog();
		dog1.bark();
		dog1.name = "����";
	
// ������� ������ ���� Dog 
		Dog [] myDogs = new Dog[3];
		//int [] arr = new int [2];
// �������� � ���� ��������� ���������
		 myDogs[0] = new Dog();
		 myDogs[1] = new Dog();
		 myDogs[2] = dog1;
		 
//		 arr [0] = 7;
//		 arr [1] = 1;  
//		 arr [2] = 3;
//		 arr [3] = 1; ������ ���������� ���������� �� ��� � ������ ������ ������� � �������� 3 ������������ ������ �������?
		 
	
// �������� ������ � �������� 	Dog � ������� ������ �� �������
		 myDogs[0].name = "����";
		 myDogs[1].name = "������";
	
// ����... ����� ��� � myDogs[2]? 
		 System.out.print("��� ��������� ������ - ");
		 System.out.println(myDogs[2].name);
	
// ������ ��������� ��� ��������� ������� � ������� ��� ������� ����� bark()
		
		 int x = 0;
		while ( x < myDogs.length) {
			 myDogs[x].bark();
			 x = x + 1;
			 
		 }
	}
	public void bark() {
		System.out.println(name + " ������ ���!");
	}
	public void eat() {}
	public void chaseCat() {}
}

