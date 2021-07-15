package nivell1;

import java.util.*;


public class LletresFase4 {

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
		
		char cognom[]=  {'O','L','L','E','R',' ','S','I','L','V','E','S','T','R','E'};
		
		List<Character> lista2 = new ArrayList<Character>();	
		
		for (int i=0;i<cognom.length;i++){
			lista2.add(cognom[i]);
		}
		lista.add(' ');
		lista.addAll(lista2);
		
		for (int i=0;i<lista.size();i++){
			System.out.print(lista.get(i));
		}
		
		

	}
}
