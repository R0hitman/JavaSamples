public class Prime {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub

		
		for(int i=0;i<=100;i++) {

		for (int j=2;j<=i-1;j++) {


		if(i%j==0) {
			System.out.print("Number is not prime");
			}

		else {
		
			System.out.print("Number is a prime"); 

			}

		}

	}

}
}