package package1;

public class Pyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		for(int i=0;i<5;i++)
		{
			
			for(int k=0;k<=5-i;k++)
			{
				
				System.out.print(" ");
			}
			
			for(int j=0;j<i;j++){
				
				System.out.print("* ");
			}
			
			System.out.println();
		}
		
	}

}
