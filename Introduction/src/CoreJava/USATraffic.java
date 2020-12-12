package CoreJava;

public class USATraffic implements CentralTrafficInterface, ContintalTrafficInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CentralTrafficInterface c = new USATraffic();
		c.flashYellow();
		c.greenGot();
		c.redStop();

		USATraffic u = new USATraffic();
		u.walkSymbol();
		// u.trainSymbol();

		ContintalTrafficInterface ct = new USATraffic();
		ct.trainSymbol();

	}

	@Override
	public void redStop() {
		// TODO Auto-generated method stub
		System.out.println("redstop implementated");

	}

	public void walkSymbol() {
		System.out.println("walking");
	}

	@Override
	public void greenGot() {
		// TODO Auto-generated method stub
		System.out.println("green go implemtated");

	}

	@Override
	public void flashYellow() {
		// TODO Auto-generated method stub
		System.out.println("yellow flash implemented");

	}

	@Override
	public void trainSymbol() {
		// TODO Auto-generated method stub
		System.out.println("train symbol implemented");

	}

}
