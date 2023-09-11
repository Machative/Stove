
public class Burner {
	
	public enum Temperature{
		BLAZING("VERY HOT!"),HOT("Careful!"),WARM("Warm"),COLD("Cool");
		private String marker;
		private Temperature(String s) {
			marker=s;
		}
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
		timer=0;
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
		timer--;
		if(timer==0) {
			timer=TIME_DURATION;
			switch(mySetting) {
				case OFF:
					switch(myTemperature) {
						case BLAZING:
							myTemperature=Temperature.HOT;
						case HOT:
							myTemperature=Temperature.WARM;
						case WARM:
							myTemperature=Temperature.COLD;
						case COLD:
							break;
					}
				case LOW:
					switch(myTemperature) {
						case BLAZING:
							myTemperature=Temperature.HOT;
						case HOT:
							myTemperature=Temperature.WARM;
						case WARM:
							myTemperature=Temperature.WARM;
						case COLD:
							myTemperature=Temperature.WARM;
					}
				case MEDIUM:
					switch(myTemperature) {
						case BLAZING:
							myTemperature=Temperature.HOT;
						case HOT:
							myTemperature=Temperature.HOT;
						case WARM:
							myTemperature=Temperature.HOT;
						case COLD:
							myTemperature=Temperature.WARM;
					}
				case HIGH:
					switch(myTemperature) {
						case BLAZING:
							break;
						case HOT:
							myTemperature=Temperature.BLAZING;
						case WARM:
							myTemperature=Temperature.HOT;
						case COLD:
							myTemperature=Temperature.WARM;
					}
			}
		}
	}
	
	public void display() {
		System.out.println(mySetting.toString()+".... "+myTemperature.marker);
	}

}
