import java.util.Scanner;

public class zadanie{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Podaj pesel :");
		String peselText= sc.nextLine();

		char ostatni = peselText.charAt(peselText.length() -1);
		
		if(ostatni == '2' ||
		ostatni == '4' ||
		ostatni == '6' ||
		ostatni == '8' 
		){
			System.out.println("jestes kobieta");
		}else{
		System.out.println("jestes facetem");
		}


	}


}