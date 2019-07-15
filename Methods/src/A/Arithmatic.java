package A;

public class Arithmatic {
	public long  areaOfCircle(int redius)
	{
		double result=Math.PI*(redius*redius);
		return (long) result;   //constsnt veriable ,operation
	}
public static void main(String[] args)
{
	Arithmatic a=new Arithmatic();
	System.out.println(a.areaOfCircle(8));
}
}
