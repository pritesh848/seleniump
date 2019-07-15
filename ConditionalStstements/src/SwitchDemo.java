import java.util.Scanner;

public class SwitchDemo {
      private static void selectDigit() {
    	  Scanner sc = new Scanner(System.in);
    	  System.out.println("enter weekday");
    	  
		int day = sc.nextInt();
		System.out.println("Entered day is :"+day);
		switch (day) {
		case 0: 
			System.out.println("sunday");
			break;
		case 1:
			System.out.println("monday");
			break;
		case 2:
			System.out.println("tuesday");
			break;
		case 3:
			System.out.println("wenesday");
			break;
		case 4:
			System.out.println("thirsday");
			break;
			
		case 5:
			System.out.println("friday");
			break;
		case 6:
			System.out.println("saturday");
			break;

		default:
			System.out.println("INVALID DAY");
		}

	}
	public static void main(String[] args) {
		
		selectDigit();
	}

}
