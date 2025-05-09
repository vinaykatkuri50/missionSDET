package basics;

public class SumOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {12,13,5,7,9,4,6};
		int sumOdd=0;
		
		for(int i=0;i<a.length;i++) {
			if(a[i]%2!=0) {
				sumOdd=sumOdd+a[i];
			}
		}
		System.out.println(sumOdd);
	}
}
