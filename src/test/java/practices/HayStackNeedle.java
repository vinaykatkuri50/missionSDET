package practices;  //HayStackNeedle.java

public class HayStackNeedle {
	
	public static int strStr(String haystack, String needle) {
		
		if(needle.isEmpty()){
			
            System.out.println("empty");
            return 0;

        }
        else if(haystack.isEmpty() || needle.length() > haystack.length()){
        	
            System.out.println("needle more length");
            return -1;
        }
        else{
            for (int i = 0; i <= haystack.length() - needle.length(); i++) {
            if (haystack.substring(i, i + needle.length()).equals(needle)) {
            	
            	String a=haystack.substring(i, i + needle.length());
            	
                return i;
            }
        }
            
            System.out.println("---length");
        }
        return -1;
		
		
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		strStr("sadbutsad", "sad");
//		strStr("test", "");
		
//		strStr("sadbutsadaaaaa", "sad");
	}
}
