package create.classA;

public class A {
	
	public static void main (String [] args) {
		A [] arr = new A[4];
		
		for (int x = 0; x < 4; x++ ) {
			arr [x] = new A();
			System.out.println(arr[x]);
		}
		}

}
