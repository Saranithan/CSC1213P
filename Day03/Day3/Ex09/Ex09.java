import java.util.Scanner;

public class Ex09{
   public static void main(String args[]){
	   Scanner s=new Scanner(System.in);
	   
	   System.out.println("Enter a number: ");
	   int a=s.nextInt();
	   
	   if(a%5==0 && a%10==0)
		     System.out.println(a+" This number is devisible by 5 and 10");
	   else
		     System.out.println(a+" This number is not devisible by 5 and 10");
   }
}