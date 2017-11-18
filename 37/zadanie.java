import java.util.Scanner;

public class zadanie{
	public static void main(String[] args){
		
		System.out.println("Program rownanie kwadratowe");
				
		Scanner sc = new Scanner(System.in);
		
		System.out.println(" Podaj a");
		Double a = sc.nextDouble();
		
		System.out.println(" Podaj b");
		Double b = sc.nextDouble();
		
		System.out.println(" Podaj c");
		Double c = sc.nextDouble();
		
		
		Double delata = (b*b)- 4*a*c;
		if(delata>0){
			Double x1 = (-b+Math.sqrt(delata))/2*a;
			Double x2 = (-b-Math.sqrt(delata))/2*a;
			
			System.out.println("Delta wieksza od zera:");
			System.out.println("pierwszy wynik :" + x1);
			System.out.println("drugi wynik :" + x2);
		}else if(delata==0){
			Double x = -b/2*a;
			System.out.println("Delta rowna zero:");
			System.out.println("pierwszy wynik :" + x);
		}else{
			System.out.println("Brak rozwiozan");
		}
	}
}