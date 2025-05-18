package practices;

public class StringTokensQ {
	
	
	public static void sTokens(String s) {
		
		String regex="[\\s!,?._'@{}-]+";
        
        String splString[]=s.split(regex);
        
        System.out.println("The String length is :"+splString.length);
        
        for(int i=0;i<splString.length;i++){
            System.out.println(splString[i]);
        }
        System.out.println("-----------------------------");
        }
		

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		sTokens("YES      leading spaces        are valid,    problemsetters are         evillllll");
		sTokens("She is absolutely   ,good,boy then it's an issue");
		sTokens("this is my, good game! and I don't care abt it, yes' that's it.");
		sTokens("Yes, I am absolutely sure about it. Don't worry!");

	}}
