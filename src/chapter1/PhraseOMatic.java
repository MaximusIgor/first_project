package chapter1;

public class PhraseOMatic {
	
	
	
	public static void main (String [] args) {
		
		// ������� ��� ������ ���� 
		
		String [] wordListOne = {"��������������" , "����-�������" , "3000 - �������", 
				"��������","�������� �������", "��������", "�� ������ ���-����������", 
				"�����������", "�����","����� ����", "����� ������������ ����", "����������"};
		
		String [] wordListTwo = {"��������������", "�������", "�������", "����������", "����������������",
				"������ �������", "���������������", "�����������", "��������������",
				"������������������", "���������", "������������ ��", "�����������������",
				"�������",  "���������������", "�������������� � �������", "�����������",
				"���������� ��", "�����", "����������", "����������"};
		
		String [] wordListThree = {"�������", "����� ���������", "����� �� ���������",
				"��� ���������", "������", "������","������� ������������ ��������",
				"������", "������ �������", "�����", "�������", "����� ����������"};
		
		// ��������� ������� ���� � ������ ������
		int oneLength = wordListOne.length;
		int twoLength = wordListTwo.length;
		int threeLength = wordListThree.length;
		
		// ���������� ��� ��������� �����
		int rand1 = (int) (Math.random()* oneLength);
		int rand2 = (int) (Math.random()* twoLength);
		int rand3 = (int) (Math.random()* threeLength);
		
		// ������ ������ �����
		String phrase = wordListOne[rand1] + " " + wordListTwo[rand2] + " " + wordListThree[rand3];
		System.out.println("���, ��� ��� ����� - ��� " + phrase);
		 
		// ���������� ������ 3-�� ������� ����
		int x = wordListThree.length;
		 System.out.println(x);
		 
		 // ������ ����������� ������� � ����� �� ����� ���������� �������
		 String [] pets = {"������", "�����", "�����"};
		 String s = pets[0];
		 
		 System.out.println("����� ��� ����� - " + s + "!");
		 
		 for (int i = 0; i < 3; i++) {
			 System.out.println(pets[i]);
	}
		 
}
}
