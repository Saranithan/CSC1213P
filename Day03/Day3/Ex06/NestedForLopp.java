import java.util.Scanner;
class ForloopEx01{
public static void main(String [] args){
	
	Scanner scan=new Scanner(System.in);
	
	System.out.println("Enter the value for counter 01 :");
	int Counter1=scan.nextInt();
	System.out.println("Enter the value for counter 02 :");
	int Counter2=scan.nextInt();
	for(int i=0; i<Counter1; i++){
		System.out.println("value for i :"+i);
		
    for(int j=0; i<Counter2; j++){
		System.out.print("value for j :"+j+" ");
	}	  
	  System.out.println();		
	}
}
}
	