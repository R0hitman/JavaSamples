package package1;

public class StringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String name="Rohit";
		int length=name.length();
		
		String rev="";
		
		for(int i=(length-1);i>=0;i--){
			
			rev=rev+name.charAt(i);
		}
		
		System.out.println(rev);
	}

}
