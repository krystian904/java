import java.util.Scanner;

public class zadanie {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.print(" podaj numer konta :");
		String numer = sc.nextLine();
		
	
		for (int i = 0 ; i <numer.length(); i++){
			
			if(i==2 || i==6 || i==10 || i==14 || i==18 || i==22) System.out.print(" ");
			System.out.print(numer.charAt(i));
			
			
		}
		
	}
}