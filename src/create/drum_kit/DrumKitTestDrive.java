package create.drum_kit;

public class DrumKitTestDrive {
	public static void main (String [] args) {

// �������� ������� ���� DrumKit		
		DrumKit d = new DrumKit();
		d.snare = false;
		d.playSnare();
		d.playTopHat();
		
		
// �������� ������������ ��������� 		
		if (d.snare == true) {
			d.playSnare();
		}
	}
}
