package chapter1;

public class Loopy {
	public static void main (String [] args ) {
		int x = 1;
		System.out.println("����� ������� ����� �������� � �����: " + x);
		
		while (x < 4) {
			System.out.println("������ ����� �������� x ����o: " + x);
			x = x + 1;
		}
		System.out.println("����� ��������� �����");
		
	}
}