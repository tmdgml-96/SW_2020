package abstactFactoryPattern_home;

public class DeajeonPrint implements Print {

	@Override
	public Small printSmall() {
		return new DeajeonSmall();
	}

	@Override
	public Big printBig() {
		return new DeajeonBig();
	}

}
