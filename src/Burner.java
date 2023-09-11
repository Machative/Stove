
public class Burner {
	
	public enum Temperature{
		BLAZING,HOT,WARM,COLD;
		
	}
	
	private Temperature myTemperature;
	private Setting mySetting;
	private int timer;
	public final int TIME_DURATION = 2;
	
	
	
	public Temperature getTemperature() {
		return myTemperature;
	}
	
	public Burner() {
		myTemperature = Temperature.COLD;
		mySetting = Setting.OFF;	
		
	}
	
	public void plusButton() {
		timer = TIME_DURATION;
		switch(mySetting) {
			case OFF:
				mySetting = Setting.LOW;
			case LOW:
				mySetting = Setting.MEDIUM;
			case MEDIUM:
				mySetting = Setting.HIGH;
			case HIGH:
				break;	
		}
	}
	
	public void minusButton() {
		timer = TIME_DURATION;
		switch(mySetting) {
			case OFF:
				break;
			case LOW:
				mySetting = Setting.OFF;
			case MEDIUM:
				mySetting = Setting.LOW;
			case HIGH:
				mySetting = Setting.MEDIUM;
		}
	}
	
	public void updateTemperature(){
		
	}
	
	public void display() {
		System.out.println(mySetting.toString());
	}
	
	
	
	
	
	
}
