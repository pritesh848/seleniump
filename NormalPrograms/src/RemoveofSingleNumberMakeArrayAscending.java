import java.util.Arrays;

public class RemoveofSingleNumberMakeArrayAscending {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int []a= {1,3,2,1};
    int []b= new int[a.length];
    
    for (int i = 0; i < a.length; i++) {
		int indx = 0;
		if(i==indx) {
			continue;
			}
		else {
			b[i]=a[i];
		}
		indx++;
		
	
    Arrays.stream(b);
    System.out.println(b[0]+b[1+b[2]]);
    for (int j = 0; j < b.length-1; j++) {
		
	Boolean k1=false;
    if((b[j+1]-b[j])==1) {
    	k1=true;
    }
    
    System.out.println(k1);
    }
    }
    
	}
}
