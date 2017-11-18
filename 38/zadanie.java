import java.util.Scanner;

public class zadanie{
	public static void main(String[] args){
		System.out.println(" program oceny slownie :");
		
		Scanner sc = new Scanner(System.in);
		System.out.print("podaj ocene liczbowa:  ");
		int ocena = sc.nextInt();
		
		switch(ocena){
			case 1:
				System.out.println("niedostateczny");
				break;
			case 2:
				System.out.println("mierny");
				break;
			case 3:
				System.out.println("dostateczny");
				break;
			case 4:
				System.out.println("dobry");	
				break;
			case 5:
				System.out.println("bardzo dobry");	
				break;
			case 6:
				System.out.println("celujacy");	
				break;
			default:
				System.out.println("zle ocena zle dane");	
				break;
		}
	}
}