class Ex2{
	public static void main(String [] args){
		
		int val[][]={{54,02,45},{67,54,87},{76,45,89},{19,10,65}};
		
		for(int i=0;i<4;i++)
		{
			int max=val[i][0];
			for(int j=0;j<3;j++)
			{
				if(max<val[i][j])
				{
					max=val[i][j];
				
				}				
			}
			System.out.print("The max is :"+max);
			System.out.println();
		}
	}
}