package practices;  //HayStackNeedle.java

public class HayStackNeedle {
	
	public static int strStr(String haystack, String needle) {
		
		int result=-1;

        if(needle.isEmpty()){
            result=0;
        }
        else if(haystack.isEmpty() || needle.length() > haystack.length()){
            result=-1;
        }
        else{
            for (int i = 0; i <= haystack.length() - needle.length(); i++) {
            if (haystack.substring(i, i + needle.length()).equals(needle)) {
                result=i;
            }
        }
        }
        return result;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		strStr("sadbutsad", "sad");
		strStr("test", "");
	}
}
