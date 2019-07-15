

public class AdjucentElementProductMax {
	public static int arrayg (int [] n) {
		int x=0;
		for (int i = 0; i < n.length-1; i++) {
			int y = n[i]*n[i+1];
			if(i==0) {
				x=y;
			}
			
			if(x<y) {
				x=y;
			}
			
		}
		System.out.println(x);
		return x;
	}

	public static void main(String[] args) {
		AdjucentElementProductMax h= new AdjucentElementProductMax();
		int[] p = {-23, 4, -3, 8, -12};
        h.arrayg(p);
	}

}
