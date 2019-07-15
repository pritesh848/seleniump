package abstraction;

public class ExecutionEngine {
	public static void main(String[] args) {
		ThreeWheeler auto = new ThreeWheeler();
		int maxSpeed = auto.setMaxSpeed(65);

		System.out.println("max speed of auto is set to " + maxSpeed + " kmph");

		TwoWheeler honda = new TwoWheeler();
		maxSpeed = honda.setMaxSpeed(115);
		System.out.println("max speed of honda is set to  " + maxSpeed + " kmph");

		FourWheeler ford = new FourWheeler();
		maxSpeed = ford.setMaxSpeed(170);
		System.out.println("max speed of ford is set to " + maxSpeed + " kmph");
	}
}
