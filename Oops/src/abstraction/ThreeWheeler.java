package abstraction;

public class ThreeWheeler extends vehicle implements AllVehicle  {

	@Override
	public int setMaxSpeed(int maxSpeed) {
		if(maxSpeed>70) {
			System.err.println("Three wheeler speed should not exceed 70km ");
		}else {
			Constants.maxSpeed=maxSpeed;
			
		}
		return Constants.maxSpeed;
	}
 //MAX SPEEED SHOULD NOT LIMIT 70

	@Override
	public void setColour() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setMaterial(String materialName) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setNumberOfLamps(int n) {
		// TODO Auto-generated method stub
		
	}
	
	
	
}
