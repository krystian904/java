import java.util.Scanner;

public class zadanie{
	public static void main(String[] args){
		// pobierz tekst z konsoli
		Scanner sc = new Scanner(System.in);
		System.out.print("Wprowadz dowolny tekst: ");
		String tekst = sc.nextLine();
		// wy�wietl tekst, dokonuj�c konwersji na wielkie litery
		System.out.println(tekst.toUpperCase());
		
	}
}