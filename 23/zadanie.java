

public class zadanie {
	public static void main(String[] args){
		for(int i = 0; i < args.length; i++) {
            if(i == 1 ) 
			System.out.println("nazwisko: " + args[0]);
			if(i == 2 ) 
				System.out.println("imie: " + args[1]);
			if(i == 3 ) 
				System.out.println("adres: " + args[2]);
			
        }
	}
}