package nivell1;

public class LletresFase1 {

	public static void main(String[] args) {
		char nom[][]=  {{'J','U','A','N',' '},{'R','A','M','O','N'}};
	
		for (int i=0;i<nom.length;i++){
			for (int j=0;j<nom[0].length;j++){
				System.out.print(nom[i][j]);
			}
		}
	}
}
