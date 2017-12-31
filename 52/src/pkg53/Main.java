
package pkg53;

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        System.out.println("podaj tekst do podzialu");
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        
        String[] slowa = text.split(" ");
        
        for(int i = 0 ; i < slowa.length ; i++){
            System.out.println(slowa[i]);
            
        }
       
    }
    
}
