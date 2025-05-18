package practices;

public class HayNeedle {
	
	public static int hayKey(String haystack,String needle) {
		
		for (int i = 0; i <= haystack.length() - needle.length(); i++) {
            if (haystack.substring(i, i + needle.length()).equals(needle)) {
            	
            	String a=haystack.substring(i, i + needle.length());
            	System.out.println(a);
            	
                return i;
            }
	}
		return 0;
		}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		hayKey("sadbutsad", "sadbutsad2");
		hayKey("test", "");

	}

}
