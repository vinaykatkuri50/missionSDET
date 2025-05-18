package assess;

import java.util.HashMap;
import java.util.TreeMap;

public class WordsCount2 {
	
	public static void words2(String str) {
		
		String str1[]=str.split("\\s");	
//		for(int i=0;i<str1.length;i++) {
//			System.out.println(str1[i]);
//		}
		
		HashMap<String, Integer> hm=new HashMap<String, Integer>();
		
		for(String a:str1) {
			if(hm.containsKey(hm)) {
				hm.put(a, hm.get(a)+1);
			}
			else {
				hm.put(a, 1);
			}
			
		}	
		System.out.println(hm);
//		System.out.println("Total words: "+str1.length);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		words2("I am working on Selenium Webdriver Selenium");
//		words2("I always belive in myself and i am proud of it");

	}

}
