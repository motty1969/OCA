package immutableClasses;

public class RunImmutable {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("initial");
		NotImmutable problem = new NotImmutable(sb);
		sb.append(" added");
		StringBuilder gotBuilder = problem.getBuilder();
		gotBuilder.append(" more");
		System.out.println(problem.getBuilder());
		System.out.println(problem.getBuilderString());
		System.out.println(sb);
	}

}
