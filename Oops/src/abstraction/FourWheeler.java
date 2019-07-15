package abstraction;


public class FourWheeler extends vehicle {

	@Override
	public int setMaxSpeed(int maxSpeed) {
		if(maxSpeed>250) {
			System.err.println("Three wheeler speed should not exceed 70km");
		}else {
			Constants.maxSpeed=maxSpeed;
		}
		return Constants.maxSpeed;
	}
}
