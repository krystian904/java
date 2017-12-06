import java.util.Scanner;

public class zadanie{
	public static void main(String[] arg){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("podaj liczbe:");
		String liczbaText = sc.nextLine();
		
		for(int i = 0;i<liczbaText.length();i++){
			tran(liczbaText.charAt(i));
			
		}
		
		
	}
	
	
	static void tran(char liczba){
		//System.out.println(liczba);
		
		switch (liczba){
			case '1':
				System.out.print("jeden ");
			break;
			
			case '2':
				System.out.print("dwa ");
			break;
			
			case '3':
				System.out.println("trzy ");
			break;
			
			case '4':
				System.out.print("cztery ");
			break;
			
			case '5':
				System.out.print("piec ");
			break;
			
			case '6':
				System.out.print("szesc ");
			break;
			
			case '7':
				System.out.print("siedem ");
			break;
			
			case '8':
				System.out.print("osiem ");
			break;
			
			case '9':
				System.out.print("dziewiec ");
			break;
			
			case '0':
				System.out.print("zero ");
			break;
		}
		
	}
	
}