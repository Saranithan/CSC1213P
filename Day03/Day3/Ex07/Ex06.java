import java.util.Scanner;

public class Ex06{
   public static void main(String args[]){
	Scanner s=new Scanner(System.in);
    System.out.print("Enter the value for counter 01 :");
     int n1= s.nextInt();
    System.out.print("Enter the value for counter 01 :");
     int n2= s.nextInt();		 

    for(int i=0;i<n1;i++)
	{
     System.out.println("The value for i : "+i);
	 
	    for(int j=0;j<n2;j++)
		{
			System.out.print("The value for j : "+j+"   ");
		}
		
		   System.out.println();
    }
   }
}   