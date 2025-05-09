package basics;

public class ReverseNumber {
	
	public static void reverse(int n) {
		
		int temp=n,rev=0,rem=0;
			
		while(temp>0) {
			
			rem=temp%10;
			rev=rev*10+rem;
			temp=temp/10;
			
		}		
			System.out.println("The reverse of the given number : "+n+" is: "+rev);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		reverse(153);
		reverse(221);
		reverse(254);
		reverse(2210); //Working as expected, as leading zero would not make any difference
		reverse(022); //Not working as expected, scenario to be handled
		reverse(365); 
	}
}
