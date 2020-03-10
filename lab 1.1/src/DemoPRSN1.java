import java.util.Scanner;

public class DemoPRSN1 {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		PRSN1 d = new PRSN1();
		d.first_name="Pushkar";
		d.last_name="rathore";
		d.gender='M';
		d.weight=71;

		System.out.println("person details:");
		System.out.println("firstname:"+d.first_name);
		System.out.println("last_name:"+d.last_name);
		System.out.println("gender:"+d.gender);
		System.out.println("gender:"+d.weight);
	}

}
