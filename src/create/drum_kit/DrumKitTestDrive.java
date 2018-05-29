package create.drum_kit;

public class DrumKitTestDrive {
	public static void main (String [] args) {

// Создание обьекта типа DrumKit		
		DrumKit d = new DrumKit();
		d.snare = false;
		d.playSnare();
		d.playTopHat();
		
		
// Проверка правильности выражения 		
		if (d.snare == true) {
			d.playSnare();
		}
	}
}
