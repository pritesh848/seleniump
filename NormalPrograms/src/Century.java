
public class Century {
	public static int century(int year) {
		int x=0;
		x=year/100;
		int i=year%100;
		if(i!=0) {
			x=x+1;
		}
		System.out.println(x);
		return x;
	}

	public static void main(String[] args) {
		
century(1);

	}

}
