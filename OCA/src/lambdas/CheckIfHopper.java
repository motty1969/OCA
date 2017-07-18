package lambdas;

public class CheckIfHopper implements CheckTrait {

	@Override
	public boolean aTester(Animal a) {
		return a.isHopper();
	}

}
