
public class ConvertMillis {
	
	// Parameters
	private int millis;
	
	// Constructors
	public ConvertMillis (){
		millis  = 0;
	}
	
	public ConvertMillis(int millis) {
		this.millis = millis;
	}
	
	// Methods
	public int getMillis() {
		return this.millis;
	}
	
	public void setMillis(int millis) {
		this.millis = millis;
	}
	
	public String convertMillis() {
		int millis = this.millis;
		int hours = millis / 3600000;
		int minutes = (millis % 3600000)/ 60000;
		int seconds = (millis % 3600000 % 60000) / 1000;
		
		return hours+":"+minutes+":"+seconds;
	}
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        ConvertMillis millis = new ConvertMillis(555550000);
        String time = millis.convertMillis();
        
        System.out.println(time);
	}

}
