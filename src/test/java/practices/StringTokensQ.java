package practices;

public class StringTokensQ {
	
	
	public static void sTokens(String s) {
		
		String regex="[ !,?._'@{}-]+";
        
        String splString[]=s.split(regex);
        
        System.out.println(splString.length);
        
        for(int i=0;i<splString.length;i++){
            System.out.println(splString[i]);
        }}
		

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		sTokens("YES      leading spaces        are valid,    problemsetters are         evillllll");
		sTokens("she is absolutely               ,good,boy then it's an issue");

	}}
