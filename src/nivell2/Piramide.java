package nivell2;

public class Piramide {

	public static void main(String[] args) {
		
		int x= 1;
		int y = 0;
		for (int i=1;i<=9;i++){
			int count = 0;
			for (int j =x;j<=9;j++){
				System.out.print("*");
				count++;
			}
			System.out.println("");
			for (int m =0;m<=y;m++){
				System.out.print(" ");
			}
			x=x+2;
			y++;
		}
	}

}
