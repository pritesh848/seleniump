
public class CopyElementsToOtherArray {

	public static void main(String[] args) {
		int p[]= {8,9,5,7,2,1,6};
		int q[]=new int [p.length];
		for (int i = 0; i < p.length; i++) {
			q[i]=p[i];
			
		}
		for(int x:q) {
			System.out.print(x+" ");
		}

	}

}
