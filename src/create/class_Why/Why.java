package create.class_Why;

public class Why {
	public static void main (String [] args) {
//		int [] arr = new int [3];
//		arr [0] = 1;
//		arr [1] = 2;
//		arr [2] = 3;
//		arr [3] = 4;
//	
//		for (int x = 0; x < 5; x++) {
//			//arr [x] = x;
//			System.out.println(arr[x]);
//		}
//	}

		 double[] alpha = new double[50];
	      int count = 0;

	      for (int i=0; i<50; i++)
	      {
	           System.out.print("variable i = " + i + "\n");
	          if (i < 25)
	          {
	                alpha[i] = i*i;
	          }
	          else {
	                alpha[i] = 3*i;
	          }

	          if (count < 10)
	          {
	            System.out.print("value = " + alpha[i]+ " "); 
	          }  
	          else {
	            System.out.print("\n"); 
	            System.out.print("value = " + alpha[i]+ " "); 
	            count = 0;
	          }

	          count++;
	          System.out.print(" count = " + count + ", ");
	      }

	      System.out.print("\n"); 

	    }
}
