package chapter1;

public class Random {
	public static void main (String [] args) {
		
// ��������� ������ ����� �������� � 9 �����		
		int [] num = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		//int [] num = {9};
// ���������������� ������ � ������ ����� ������ �����		
		int numLength = num.length;
		//int numLength = num.length;
		
		
// ��������� ���������� one ������� � ������� ������ Math � ������ random ���������� ��������� ����� �� �������
		int one = (int) (Math.random() * numLength);

// ������� �� ����� ��������� �����		
		System.out.println(one);

}
}
