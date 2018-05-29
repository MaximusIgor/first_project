package chapter1;

public class Test1 {
	public static void main (String []args ) {
		
		int x = 0;
		int y = 0;
		
		while (x < 5) {
			//y = y + x;  выполняется действие
			//y = x - у;  не выполняется действие
			
			//y = y + 2;  
			//if (y > 4) {    //этот блок выполняется нормально
				//y = y - 1;
			//}
			
		 //x = x + 1;  эти примеры отработают нормально
		 //y = y + x;
			
			
//			if (y < 5) {
//			x =	x + 1;
//			if (y < 3) {
//				x = x - 1;   этот блок кода выполняет данную программу без ошибок
//			}
//			}
//			y = y + 2;
			
			System.out.print( x + "" + y + " ");
			
			x = x + 1;
		}
	}

}
