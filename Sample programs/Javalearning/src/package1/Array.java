package package1;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int a[]={10,20,30,40,0};
		int max =a[0];
		
		for(int i=1;i<a.length;i++){
			
			
			if(a[i]>max){
				
				max = a[i];
				
			}
			
		}
		
		System.out.println(max);
	}

}
