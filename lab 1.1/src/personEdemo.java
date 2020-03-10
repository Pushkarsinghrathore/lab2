import java.util.Scanner;

enum e {
	M, F;
}

public class personEdemo {

	public static void main(String[] args) {
	
		Scanner s= new Scanner(System.in);
		
		String fname, lname, weight;
		String gender;
		System.out.println("Enter Fname of Person:");
		fname = s.next();
		System.out.println("Enter Lname of Person:");
		lname = s.next();
		
		System.out.println("Enter Weight of Person:");
		weight = s.next();
		while(true) {
			System.out.println("Enter your gender:");
			gender = s.next().toUpperCase();
if(e.valueOf(Character.toString(gender.charAt(0)))==e.M||e.valueOf(Character.toString(gender.charAt(0)))==e.F) {
		
		break;
}
		else {
			System.out.println("Invalid");
			
		     }
                     }
Person_Details p = new Person_Details();
		p.setFname(fname);
		p.setLname(lname);
		p.setGender(gender.charAt(0));
		p.setWeight(Integer.parseInt(weight));
	
		  System.out.println("Personal Details:"); 
		 System.out.println("First name:"+p.getFname()); 
		  System.out.println("last name:" +p.getLname()); 
		  System.out.println("gender:" +p.getGender());
		  System.out.println("weight:" +p.getWeight());
		 
		}
		
		

	}



