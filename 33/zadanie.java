import java.util.Scanner;

public class zadanie{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print(" podaj ilosc centymetrow wzrostu:");
		
		Double centymetry = sc.nextDouble();
		
		System.out.println(" Konwersia :");
		System.out.println(" Poda³es "+centymetry + " cm");
		System.out.println(" Poda³es "+centymetry/2.5 + " cali");
		System.out.println(" Poda³es "+centymetry/30.48 + " stopy");
	}
}