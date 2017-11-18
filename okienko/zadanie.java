import javax.swing.JFrame;

public class zadanie extends JFrame{
	public zadanie(){
		super("program hello word okienkowy");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		pack();
		setVisible(true);
		
	}

	
	public static void main(String[] args){
		System.out.println("dzialam");
		zadanie z = new zadanie();
	}
	
}