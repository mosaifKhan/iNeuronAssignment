
public class Launch7 {

	public static void main(String[] args) {
		
		int n=8;
		
		for (int i=0; i<n; i++)				
		{	
			for (int j=0; j<n; j++)		
			{
//				For **I**
				if(i==0&&j<3*n/4||i==n-1&&j<3*n/4||j==n/4)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}	
			
//			For **N**
			for (int j=0; j<n; j++)		
			{
				if(j==0||j==n-1||i==j)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			
//			For **E**
			for (int j=0; j<n; j++)		
			{
				if((j==n/4)||
						(i==n-1&&j>n/4)||
						(i==0&&j>n/4)||
						(i==n/2&&j>n/4&&j<3*n/4))
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			
//			For **U**
			for (int j=0; j<n; j++)		
			{
				if((j==n/4&&i!=n-1)||(j==n-1&&i!=n-1)||(i==n-1&&j>n/4&&j!=n-1))
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			
//			For **R**
			
			for (int j=0; j<n; j++)		
			{
				if((j==2)||(i==0&&j>n/4)||
						(i==(n-1)/2&&j>n/4)||
						j==n-1&&i<(n-1)/2||i-j==(n-4)/2&&j>(n-1)/2)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			
//			For **O**
			for (int j=0; j<n; j++)		
			{
				if((j==n/4&&i!=0&&i!=n-1)||
						(i==0&&j>n/4&&j<n-1)||
						(j==n-1&&i!=0&&i!=n-1)||
						(i==n-1&&j>n/4&&j<n-1))
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			
			
//			For **N**
			for (int j=0; j<n; j++)		
			{
				if(j==0||j==n-1||i==j)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}

}
