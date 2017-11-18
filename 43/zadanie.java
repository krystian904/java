import java.util.Scanner;

public class zadanie{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("program liczby pierwsze");
		System.out.println("podaj liczbe do sprawdzenia :");
		
		int liczba = sc.nextInt();
		boolean war = true;
		
		for(int i =2;i<liczba;i++){
			if(liczba%i==0){
				System.out.println("liczba "+ liczba +" jest  podzielna przez "+ i);
				war = false;
			}
				
		}
		
		if(war) System.out.println("liczba jest liczba pierwsza");
		if(!war) System.out.println("liczba nie jest liczba pierwsza");
	}
}