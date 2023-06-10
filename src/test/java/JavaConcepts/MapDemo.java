package JavaConcepts;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebDriver;

public class MapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,Integer> hm= new HashMap<String,Integer>();
		hm.put("varsha", 322323);
		hm.put("two",2);
		System.out.println(hm);

		for (Map.Entry<String, Integer> i : hm.entrySet()) {
			
			System.out.println(i);
			System.out.println(i.getKey());
			System.out.println(i.getValue());
			
		}
		

	}

}
