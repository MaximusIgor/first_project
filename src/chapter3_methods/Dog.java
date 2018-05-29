package chapter3_methods;

public class Dog {
	int size;
	String name;
//	void vuf(int numOfBarks) {
//		while(numOfBarks > 0) {
//			System.out.println("Gav Gav!");
//			numOfBarks = numOfBarks - 1;
//		}
//	}
	void bark() {
		if (size > 60) {
	System.out.println("Ãàâ Ãàâ!");
		}else if(size > 14){
		System.out.println("Âóô Âóô!");
	}else {
		System.out.println("Òÿô Òÿô!");
		}
	}
}