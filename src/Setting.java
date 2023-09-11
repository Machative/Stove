
public enum Setting {
	OFF("---"){
		@Override
		public String toString() {
			return "[---].... Cool";
		}
	}, LOW("--+"){
		@Override
		public String toString() {
			return "[---].... Warm";
		}
	}, MEDIUM("-++"){
		@Override
		public String toString() {
			return "[---].... Careful!";
		}
	}, HIGH("+++"){
		@Override
		public String toString() {
			return "[---].... VERY HOT!";
		}
	};
	private String marker;
	
	private Setting(String s) {
		marker=s;
	}
}
