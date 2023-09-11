
public enum Setting {
	OFF("---"), LOW("--+"), MEDIUM("-++"), HIGH("+++");
	private String marker;
	
	private Setting(String s) {
		marker=s;
	}
	
	public String toString() {
		return marker;
	}
}
