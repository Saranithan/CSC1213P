import java.util.Scanner;
class Check{
public static void main(String[] args){
	
	Scanner sc = new Scanner(System.in);
	
	System.out.print("Enter a num1 :");
	int Num1 = sc.nextInt();
	System.out.print("Enter a num2 :");
	int Num2 = sc.nextInt();
	System.out.print("Enter a num3 :");
	int Num3 = sc.nextInt();
	
	if(Num1>Num2 && Num1>Num3)
	{
		System.out.print("Maximum number is :"+Num1);	
	}
	else if(Num2>Num1 && Num2>Num3)
	{
		System.out.print("Maximum number is :"+Num2);
	}
	else
	{
		System.out.print("Maximum number is :"+Num3);
	}
}
}