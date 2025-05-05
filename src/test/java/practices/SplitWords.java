package practices;

public class SplitWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a="This is my dream and I will achieve it soon";
		
		String b[]=a.toLowerCase().split("\\s");
		
		for(int i=0;i<b.length;i++) {
			System.out.println(b[i]);
		}
		
//		String c="java has played a vital role and it has significance";
//		
//		String d[]=c.toLowerCase().split("\\s");
//		
//		for(int i=0;i<d.length;i++) {
//			System.out.println(d[i]);
//		}
		


	}

}
