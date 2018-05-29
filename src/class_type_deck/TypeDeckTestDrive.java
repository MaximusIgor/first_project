package class_type_deck;

public class TypeDeckTestDrive {
	 public static void main (String [] args) {
		 TypeDeck t = new TypeDeck();
		 t.canRecord = true;
		 t.playTape();
		 
		 if (t.canRecord == true) {
			 t.recordTape();
		 }
	 }
}
