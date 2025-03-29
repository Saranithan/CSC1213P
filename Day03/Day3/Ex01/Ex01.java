import java.util.Scanner;
class Check{
public static void main(String[] args){
	
	Scanner sc = new Scanner(System.in);
	
	System.out.print("Enter a num :");
	int Num1 = sc.nextInt();
	
	if(Num1>0)
	{
		System.out.print("This is positive");	
	}
	else if(Num1<0)
	{
		System.out.print("This is negative");
	}
	else
	{
		System.out.print("This is zero");
	}
}
}