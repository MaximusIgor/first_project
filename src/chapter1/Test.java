package chapter1;

public class Test {
	public static void main (String [] args) {
//		int x = 4;
//		while (x > 3) {
//			
//			x = x - 1;
//			
//			
//		}
//		System.out.println(x);
	
	int [][] matrice = {{1,2,3}, 
					    {4,5,6}, 
						{7,8,9}};
	
	
	for (int i = 0; i < matrice.length; i++) {
		for (int j = 0; j < matrice[i].length; j++) {
			System.out.print(matrice [i][j] + " ");
	}
		System.out.println();
	}
	
	
//	System.out.print("{" + matrice[0][0] + ",");
//	System.out.print(matrice[0][1] + ",");
//	System.out.print(matrice[0][2] + "}");
//	System.out.println();
//	System.out.print("{" + matrice[1][0] + ",");
//	System.out.print(matrice[1][1] + ",");
//	System.out.print(matrice[1][2] + "}");
//	System.out.println();
//	System.out.print("{" + matrice[2][0] + ",");
//	System.out.print(matrice[2][1] + ",");
//	System.out.print(matrice[2][2] + "}");
	}

}
