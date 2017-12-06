import java.util.Scanner;

public class zadanie{
	public static void  main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("podaj ciag znakow");
		String ciag = sc.nextLine();
		
		for(int i =0; i< ciag.length();i++){
			System.out.print(ciag.charAt(i)+"  ");
			
		}
		
	}
}