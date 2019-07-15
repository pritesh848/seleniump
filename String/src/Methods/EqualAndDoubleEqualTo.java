package Methods;

public class EqualAndDoubleEqualTo {

	public static void main(String[] args) {
	   String s = "pritesh";
	   String p = "pritesh";
	   String o = new String(s);
	   System.out.println(o.toString());
	   
	   if(p.equals(o)) {
		   System.out.println("address is same ");
	   }else{
		   System.out.println("addres is not same");
	   }

	}

}
