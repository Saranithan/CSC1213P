import java.util.Scanner;
class TwoD2{
	public static void main(String [] args){
		Scanner sc=new Scanner(System.in);
		int marks[][]= new int[2][2];
		
		
		System.out.println("Enter the values :");
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<2;j++)
			{
				marks[i][j]=sc.nextInt();
			}
		}
		int sum=0;
		int max=marks[0][0];
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<2;j++)
			{
				System.out.print(marks[i][j]+" ");
				sum=sum+marks[i][j];
				if(max<marks[i][j])
				{
					max=marks[i][j];
				}	
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("Total is : "+sum);
		System.out.println("The max is :"+max);
		
	}
}