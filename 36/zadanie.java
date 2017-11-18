import java.util.Scanner;

public class zadanie{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("--------------------------");
		System.out.println("|PROGRAM PODATEK DOCHODWY|");
		System.out.println("--------------------------");
		System.out.print("Podaj swoje zarobki roczne: ");
		Double zarobki = sc.nextDouble();
		
		if(zarobki<= 85528){
			System.out.println(" Podatek do zap³acenia to :" + zarobki * 0.18);
		}else{
			System.out.println(" Podatek do zap³acenia to :" + zarobki * 0.32);
		}
	}
}