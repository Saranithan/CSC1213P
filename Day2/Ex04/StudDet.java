import java.util.Scanner;
class StudDet{
	public static void main(String args []){
		
		String Name;
		
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Enter your name :");
		Name = sc.nextLine();
		
		System.out.print("Enter your age:");
		int Age = sc.nextInt();
		
		System.out.print("Enter your Reg no :");
		String Reg = sc.next();
		
		
		System.out.print("Enter your Sex :");
		char Sex = sc.next().charAt(0);
		
		System.out.print("Enter your mobile number :");
        long Mob =sc.nextLong();

		System.out.print("Enter your GPA :");
		double GPA =sc.nextDouble();
		
		System.out.print("Enter your name :"+Name+"\n"+"Your Reg number :"+Reg+"\n"+"Your Age :"+Age+"\n"+"Sex :"+Sex+"\n"+"Yur mobile Number :"+Mob+"\n"+"Your GPA :"+GPA );		

		
}
}