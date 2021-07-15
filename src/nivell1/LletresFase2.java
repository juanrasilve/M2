package nivell1;

import java.util.*;


public class LletresFase2 {

	public static void main(String[] args) {
		char nom[][]=  {{'J','U','A','N',' '},{'R','A','M','O','N'}};
		
		List<Character> lista = new ArrayList<Character>();
		
		for (int i=0;i<nom.length;i++){
			for (int j=0;j<nom[0].length;j++){
				lista.add(nom[i][j]);
			}
		}
		
		
		for (int x=0;x<lista.size();x++) {
			if (esConsonante(lista.get(x))) {
				System.out.println(lista.get(x) + " 'CONSONANT'");
			}else if(esVocal(lista.get(x))){
				System.out.println(lista.get(x) + " 'VOCAL'");
			}else if (Character.isDigit(lista.get(x))){
				System.out.println("Els noms de persones no contenen números!");
			}
		}
		
	}
	
	public static boolean esConsonante(char letra) {
		  return "bcdfghjklmnñpqrstvwxyz".contains(String.valueOf(letra).toLowerCase());
	}
	public static boolean esVocal(char letra) {
		  return "aeiou".contains(String.valueOf(letra).toLowerCase());
	}
}
