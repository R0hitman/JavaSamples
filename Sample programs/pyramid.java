public class Pyramid {

	public static void main(String[] args) {
		

	
		for(int i=1;i<=6;i++)
		{
			
			for(int k=1;k<=6-i;k++)
			{
				
				System.out.print(" ");
			}
			
			for(int j=1;j<=i;j++){
				
				System.out.print("* ");
			}
			
			System.out.println();
		}
		
	}

}
