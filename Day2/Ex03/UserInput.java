import java.util.Scanner;
class UserInput{
	public static void main(String args []){
		
		String fname;
		
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Enter your firstname :");
		fname = sc.nextLine();
		
		System.out.print("Enter your Lastname:");
		String lname = sc.next();
		
		System.out.print("Enter your marks:");
		int marks =sc.nextInt();
		
		System.out.print("Fullname :"+fname+" "+lname+ "\n"+"Marks is "+ marks);
}
}