package assess;

import java.util.HashMap;

public class WordsCount {
	
	public static void words(String s) {
		
		//State Street Round 1 Question
		String a[]=s.toLowerCase().split("\\s+");
		
//		for(int i=0;i<a.length;i++) {
//			System.out.println(a[i]);
//			
//		}
		
		HashMap<String, Integer> hm=new HashMap<String, Integer>();
		
		for(String b:a) {
			if(hm.containsKey(b)) {
				hm.put(b, hm.get(b)+1);
			}else {
				hm.put(b, 1);
			}
		}
		
		System.out.println(hm);
		System.out.println("----------------");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		words("I am working on Selenium Webdriver Selenium");
		words("I always belive in myself and i am proud of it");

	}

}
