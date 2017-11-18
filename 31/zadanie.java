import java.util.Scanner;

public class zadanie{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Podaj imie i nazwisko: ");
		String in = sc.nextLine();
	
		String[] inArray = in.split(" ", 3);
		
		//inArray[0].setCharAt(0 , 'K');
		//inArray[1].setCharAt(0 , 'K');
		//System.out.println("Twoje imie i nazwisko to : "+ inArray[0] + " " + inArray[1] );
		
		char[] imieZnaki = inArray[0].toCharArray();
		char[] nazwiskoZnaki = inArray[1].toCharArray();
		
		imieZnaki[0] = Character.toUpperCase(imieZnaki[0]);
		nazwiskoZnaki[0] = Character.toUpperCase(nazwiskoZnaki[0]);
		
		String imie = new String(imieZnaki);
		String nazwisko = new String(nazwiskoZnaki);
		
		System.out.println("Twoje imie i nazwisko to : "+ imie + " " + nazwisko );

	}	
}