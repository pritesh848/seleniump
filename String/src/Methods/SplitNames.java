package Methods;

public class SplitNames {

	public static void main(String[] args) {
		String str = "Pritesh muli ,Pankaj Devgade ,Shashank baradiya, shashikant kad ,dipak waghmare,Dipika Padukon ,Katrina Kaif ,kalol Devgan";
		String[] Names = str.split(" ");
		System.out.println("Total number of names are "+Names.length);
		String sd[]= str.split(" ");	
		for (String valu : sd) {
			System.out.print(valu+"^");
		}
		System.out.println(Names[5]);
	}
}
