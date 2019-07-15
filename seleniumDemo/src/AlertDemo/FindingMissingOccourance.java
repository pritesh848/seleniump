package AlertDemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindingMissingOccourance {
	public static void main(String[] args) {
		int counter = 0;
	
	int[] n= {2,6,9,3};
	if(n.length>1) {
	Arrays.sort(n); 

	for (int i = 0; i < n.length-1; i++) {
	
	if ((n[i+1]-n[i])!=1) {
		//counter++;
		
	     counter+=(n[i+1]-n[i]-1);
	}
	}
	}
	System.out.println(counter);
	}
}
