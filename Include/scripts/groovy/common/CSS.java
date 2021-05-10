package common;

public class CSS {
 
	public enum name {
		COLOR("color"),
		FONT_SIZE("font-size"),
		FONT_WEIGHT("font-weight"),
		FONT_FAMILY("font-family"),
		SRC("src");
		public String value;

		private name(String value) {
			this.value = value;
		}
	}
}