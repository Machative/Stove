
public class Burner {
	
	public enum Temperature{
		BLAZING("VERY HOT!"),HOT("Careful!"),WARM("Warm"),COLD("Cool");
		private String marker;
		private Temperature(String s) {
			marker=s;
		}
		public String toString() {
			return marker;
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
				break;
			case LOW:
				mySetting = Setting.MEDIUM;
				break;
			case MEDIUM:
				mySetting = Setting.HIGH;
				break;
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
				break;
			case MEDIUM:
				mySetting = Setting.LOW;
				break;
			case HIGH:
				mySetting = Setting.MEDIUM;
				break;
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
							break;
						case HOT:
							myTemperature=Temperature.WARM;
							break;
						case WARM:
							myTemperature=Temperature.COLD;
							break;
						case COLD:
							break;
					}
					break;
				case LOW:
					switch(myTemperature) {
						case BLAZING:
							myTemperature=Temperature.HOT;
							break;
						case HOT:
							myTemperature=Temperature.WARM;
							break;
						case WARM:
							myTemperature=Temperature.WARM;
							break;
						case COLD:
							myTemperature=Temperature.WARM;
							break;
					}
					break;
				case MEDIUM:
					switch(myTemperature) {
						case BLAZING:
							myTemperature=Temperature.HOT;
							break;
						case HOT:
							myTemperature=Temperature.HOT;
							break;
						case WARM:
							myTemperature=Temperature.HOT;
							break;
						case COLD:
							myTemperature=Temperature.WARM;
							break;
					}
					break;
				case HIGH:
					switch(myTemperature) {
						case BLAZING:
							break;
						case HOT:
							myTemperature=Temperature.BLAZING;
							break;
						case WARM:
							myTemperature=Temperature.HOT;
							break;
						case COLD:
							myTemperature=Temperature.WARM;
							break;
					}
					break;
			}
		}
	}
	
	public void display() {
		System.out.println("["+mySetting.toString()+"].... "+myTemperature.toString());
	}

}
