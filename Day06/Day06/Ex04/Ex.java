class Ex{
	public static void main(String [] args){
		int val[][]={{98,12,34,32},{45,54,67,45},{13,14,89,87}};
		int sum=0;
		
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<4;j++)
			{
				System.out.print(val[i][j]+" ");
				sum=sum+val[i][j];
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("The sum of all elements :"+sum);
		
		System.out.println();		
		for(int i=0;i<3;i++)
		{
			int Sum=0;
			for(int j=0;j<4;j++)
			{
				Sum=Sum+val[i][j];
			}
			System.out.println("Total value of "+(i+1)+"st raw :"+Sum);
		}
		
		
		
	}
}