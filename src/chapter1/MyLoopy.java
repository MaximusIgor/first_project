package chapter1;

public class MyLoopy {
	public static void main (String [] args) {
		
		for (int x = 0; x < 5; x++) {
		  System.out.println(x);
		
		  while (x == 4) {
			
			System.out.println("��� ������� �������-�� ����������� ������ ��� � ���� �����: " + x);
			x = x + 1;
		  }
		}
		System.out.println("����� ������ ���������");
	
	}
}
