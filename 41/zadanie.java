public class zadanie{
	public static void main(String[] args){
		int n = Integer.parseInt(args[0]);
		
		
		int ciag = 1;
		System.out.print(ciag + " ");
		for(int i = 0 ; i<n;i++){
			ciag +=3;
			System.out.print(ciag+ " ");
		}
	}
}