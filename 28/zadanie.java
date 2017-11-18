import java.util.Scanner;

public class zadanie{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		System.out.println(" podaj dwa wyrazy do porwnianie dlugosci");

		System.out.println(" podaj pierwszy wyraz zakonczony enterem :");
		String wyrazP =  sc.nextLine();

		System.out.println(" podaj drugi wyraz zakonczony enterem :");
		String wyrazD =  sc.nextLine();

		int P = wyrazP.length();
		int D = wyrazD.length();
		
		
		if(P > D) System.out.println(" wyraz piewrszy jest d³u¿szy od drugiego");
		if(P < D) System.out.println(" wyraz piewrszy jest krutszy   od drugiego");
		if(P == D) System.out.println(" wyraz piewrszy jest równy drugiemu");
		
	}
}
