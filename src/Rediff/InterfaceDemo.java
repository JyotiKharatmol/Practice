
package Rediff;

public class InterfaceDemo implements CentralTraffic, ContinentTraffic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CentralTraffic a = new InterfaceDemo();
		a.green();
		a.red();
		a.yellow();
		
		InterfaceDemo at = new InterfaceDemo();
		at.watchTrafficSignal();
		
		
		ContinentTraffic ac = new InterfaceDemo();
		ac.ContinentSignals();
		
	}

	@Override
	public void green() {
		// TODO Auto-generated method stub
		System.out.println("green go");
	}

	@Override
	public void red() {
		// TODO Auto-generated method stub
		System.out.println("red stop");

	}
	public void watchTrafficSignal()
	{
		System.out.println("watch traffic signal");
	}

	@Override
	public void yellow() {
		// TODO Auto-generated method stub
		System.out.println("yellow wait");

	}

	@Override
	public void ContinentSignals() {
		// TODO Auto-generated method stub
		System.out.println("continentSignals - red, yellow, green");
	}

}
