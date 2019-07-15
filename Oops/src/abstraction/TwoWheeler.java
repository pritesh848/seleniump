package abstraction;

public class  TwoWheeler extends vehicle {

	@Override
	public int setMaxSpeed(int maxSpeed) {
		if(maxSpeed>120) {
			System.err.println("Two wheeler speed should not exceed 120km");
		}else {
			Constants.maxSpeed=maxSpeed;
		}
		return Constants.maxSpeed;
	}


}