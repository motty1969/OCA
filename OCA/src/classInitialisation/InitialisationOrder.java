package classInitialisation;

public class InitialisationOrder {
	private String name = "Torchie";
	{ System.out.println(name); }
	private static int COUNT = 0;
	static { System.out.println(COUNT); }
	static { COUNT += 10; System.out.println(COUNT); }
	public InitialisationOrder () {
		System.out.println("constructor");
	}
	public static void main(String[] args) {
		System.out.println("read to construct");
		new InitialisationOrder();
	}
}
