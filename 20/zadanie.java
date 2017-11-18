public class zadanie{
	
	public static void main(String[] args){
		System.out.println("\u006B \u0052 \u0053 ");
		
		
		Charset utf8Charset = Charset.forName("UTF-8");
		Charset defaultCharset = Charset.defaultCharset();
		System.out.println(defaultCharset);
		// charset is windows-1252
	}
}