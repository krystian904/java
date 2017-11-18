import java.util.Scanner;

public class zadanie{
	public static void main(String[] args){
		
		System.out.println("Program kalkulator");
		Scanner sc = new Scanner(System.in);
		
		System.out.print("wprowadü argument 1:");
		Double argu1 = sc.nextDouble();
		
		System.out.print("wprowadü argument 2:");
		Double argu2 = sc.nextDouble();
		
		System.out.print("podaj znak +-/*:");
		char znak = sc.next().charAt(0);
	
		switch(znak){
			case '+':
				System.out.println("rezultat: "+ argu1 + " " + znak + " " + argu2 + " = "+ (argu1+argu2 ));
				break;
			case '-':
				System.out.println("rezultat: "+ argu1 + " " + znak + " " + argu2 + " = "+ (argu1-argu2))  ;
				break;
			case '*':
				System.out.println("rezultat: "+ argu1 + " " + znak + " " + argu2 + " = "+ (argu1*argu2))  ;
				break;
			case '/':
				System.out.println("rezultat: "+ argu1 + " " + znak + " " + argu2 + " = "+ (argu1/argu2))  ;
				break;
			default:
				System.out.println(" zle oblugujesz klawiature");
				break;
			
		}
	
	}
	
}