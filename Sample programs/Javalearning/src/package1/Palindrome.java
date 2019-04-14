package package1;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int OriginalNum= 525,num=0,ReverseNum=0;
		    num=OriginalNum;
		
		if(num!=0){
			
			int Temp= num % 10;					//525%10 , temp =5, num=52
												//52%10  , temp =2, num=5
												//5%10   , temp =5, num=0
			ReverseNum= ReverseNum * 10+ Temp;  //ReverseNum=0*10+5 = 5
			num=num/10;							//ReverseNum=5*10+2 = 52
												//ReverseNum=52*10+5 =525
		}
		if(ReverseNum==OriginalNum){
			System.out.println(OriginalNum + " is a palindrome");
		}
		else{
			System.out.println(OriginalNum + " is not palindrome");
		}
		


	}

}
	

