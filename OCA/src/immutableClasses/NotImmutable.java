package immutableClasses;

public class NotImmutable {
	private StringBuilder builder;
	
	public NotImmutable(StringBuilder b) {
		builder = new StringBuilder(b);
	}
	public StringBuilder getBuilder() {
		return new StringBuilder(builder);
	}
	public String getBuilderString() {
		return builder.toString();
	}
}
