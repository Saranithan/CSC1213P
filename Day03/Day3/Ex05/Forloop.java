import java.util.Scanner;
class ForloopEx01{
public static void main(String [] args){
	
	Scanner scan=new Scanner(System.in);
	
	System.out.println("Enter the number :");
	int Num=scan.nextInt();
	for(int i=1; i<=Num; i++){
		System.out.print(i+"\t");
	}
}
}
	