
public class Rucursionn {
	public   int recursive(int i) {
    	if(i==1) {
    		return i;
    	}
    		return i*recursive(i--);
   
    
	}
   
}
