import java.util.Formatter;

public class zadanie {
		public static void main(String[] args){
			Formatter f = new Formatter();
			
			for(int i=1; i<13;i++){
				System.out.println(" ");	
				for(int o=1; o<13;o++){
					//System.out.print((i*o)+ " ");	
					System.err.printf("%1$5s ",i*o);

				}
			}
			
	}
}