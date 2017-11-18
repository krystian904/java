public class zadanie{
	public static void main(String[] args){
		int netto = Integer.parseInt(args[0]);
		String nazwa = args[1];
		System.out.println("wrpowadziels do programu produkt o nazwie "+  nazwa +" w cenie netto - " + netto);
		System.out.print("koszt brutto wynosi ");
		System.out.print( netto * 0.22 + netto);
		System.out.print( " zł");
		
		
		
	}
	
}