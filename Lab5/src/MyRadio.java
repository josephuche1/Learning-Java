
public class MyRadio {
	public static void main(String[] args) {
		Radio newRadio = new Radio();
		System.out.println("Classic FM: "+Radio.CLASSIC_FM);
		System.out.println("BBC Radio 3: "+Radio.frequencyOfBBC(3));
		
		newRadio.setFrequency(Radio.BRMB);
		newRadio.listen();
		
		newRadio.setFrequency(Radio.frequencyOfBBC(2));
		newRadio.listen();
		
		newRadio.setFrequency(92.7f);
		newRadio.listen();
		
		newRadio.setFrequency(94.5f);
		newRadio.listen();
		
	}
}
