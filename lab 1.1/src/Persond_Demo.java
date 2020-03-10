import java.util.Scanner;

public class Persond_Demo {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String fname, lname, weight;
		String gender;
		System.out.println("Enter Fname of Person:");
		fname = s.next();
		System.out.println("Enter Lname of Person:");
		lname = s.next();
		System.out.println("Enter gender of Person:");
		gender = s.next();
		System.out.println("Enter Weight of Person:");
		weight = s.next();

		Person_Details details = new Person_Details();
		
		details.setFname(fname);
		details.setLname(lname);
		details.setGender(gender.charAt(0));
		details.setWeight(Integer.parseInt(weight));
	
		  System.out.println("Personal Details:"); 
		 System.out.println("First name:"+details.getFname()); 
		  System.out.println("last name:" +details.getLname()); 
		  System.out.println("gender:" +details.getGender());
		  System.out.println("weight:" +details.getWeight());
		 
	}

}
