package nivell1;

import java.util.*;


public class LletresFase3 {

	public static void main(String[] args) {
		char nom[][]=  {{'J','U','A','N',' '},{'R','A','M','O','N'}};
		
		List<Character> lista = new ArrayList<Character>();
		
		HashMap<String,Integer> map = new HashMap<String,Integer>();
		
		for (int i=0;i<nom.length;i++){
			int x =1;
			for (int j=0;j<nom[0].length;j++){
				lista.add(nom[i][j]);
				if (map.containsKey(String.valueOf(nom[i][j]))) {
					if (map.containsValue(x)) {
						map.replace(String.valueOf(nom[i][j]),x+1);
						x++;
					}
				}else {
					map.put(String.valueOf(nom[i][j]),1);
				}
			}
		}	 
		
		for (Map.Entry<String, Integer> entry : map.entrySet()) {
		    System.out.println("Clau='" + entry.getKey() + "', valor=" + entry.getValue());
		}
		

	}
}
