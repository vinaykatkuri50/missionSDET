package basics;

public class SumEven {
	
	public void sumOfEven(int n[]) {
		
		int sum=0;
		
		for(int i=0;i<n.length;i++) {
			if(n[i]%2==0) {
				sum=sum+n[i];
			}
		}
		System.out.println("Sum of Even numbers: "+sum);
//		return sum;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SumEven s=new SumEven();
		s.sumOfEven(new int[] {1,4,3,5,6,8});
		s.sumOfEven(new int[] {0,41,30,52,60,81,11});

	}

}
