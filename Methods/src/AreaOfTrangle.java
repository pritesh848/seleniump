
public class AreaOfTrangle {
	static int areaOfsquare(int l, int w) {
		int area = l * w;
		return area;
	}

	public int triangleArea(int h, int w) {
		int area = h * w / 2 + areaOfsquare(4, 6);
		System.out.println(area);
		//areaOfsquare(1, 1);
		return area;
	}

	public static void main(String[] args) {
		AreaOfTrangle a = new AreaOfTrangle();
		// AreaOfTrangle b = new areaOfsquare();
		System.out.println("area of both " + a.triangleArea(5, 9) + areaOfsquare(1, 1));
		System.out.println(a.triangleArea(4, 2));
	}
}
