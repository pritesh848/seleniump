
public class EvenFromOtherStringInFirst {

	public static void main(String[] args) {
		int p[] = { 8, 5, 7, 4, 63,16};
		int q[] = { 2, 11, 13, 14, 10,15 };

		for (int i = 0; i < q.length; i++) {
			if (q[i]%2!=0) {
				int t=q[i];
				for (int j = 0; j < p.length; j++) {
					if (p[j]%2==0) {
						q[i]=p[j];
						p[j]=t;
						break;
					}
				}
			}
			
			}
		for(int k: p) {
		System.out.print(k+" ");
		}
		System.out.println();
		for(int k: q) {
			System.out.print(k+" ");
			}

		
	}
}

