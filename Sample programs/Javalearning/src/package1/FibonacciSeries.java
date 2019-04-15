package package1;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i=0,j=1,k=1;
		
		System.out.print("1  1 " );
		
		while(i<=60)
		{
			i=j+k;
			System.out.print(k + " ");
			j=k;
			k=i;
			
		}
	}

}
