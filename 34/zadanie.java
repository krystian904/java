import java.util.Scanner;

public class zadanie{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("program BMI");

		System.out.print("Podaj swoj wzrost");
		Double wzrost = sc.nextDouble();

		System.out.print("Podaj swoja wage");
		Double waga = sc.nextDouble();
		
		Double bmi = waga / ((wzrost /100) * (wzrost /100));
		
		if(bmi<=18.5 ){
			System.out.println("	niedowaga");
		}else if(bmi>18.5 && bmi <=25){
			System.out.println("waga prawid³owa");
		}else if(bmi>25 && bmi <=30){
			System.out.println("nadwaga");
		}else if( bmi >30){
			System.out.println("oty³oœæ");
		}
		
	}
}