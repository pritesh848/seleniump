
public class MaxNumber {
	static int max = 0;
	public static int maxnum(int a[]) {
		for (int i = 0; i < a.length; i++) {
			
			if(a[i]>max){
				max=a[i];
			}
		}
		return max;
	}

	public static void main(String[] args) {
		  int a[] = {5,8,9,52,211,74,51145};
		  maxnum(a);
         System.out.println(max);
	}

}
