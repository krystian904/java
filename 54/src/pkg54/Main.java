
package pkg54;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Random random = new Random();
        Scanner sc = new Scanner(System.in);
        
        System.out.println("podaj liczbe rzutow koskom");
        int liczba = sc.nextInt();
        
        int[] liczbaOczek = new int[6];
        
        for(int i =0; i< liczba; i++){
            int tmpRandom = random.nextInt(6);
            liczbaOczek[tmpRandom]++;
        }
        
        System.out.println("Rezultat "+ liczba + " rzutów kostką");
        System.out.println("====================================");
        System.out.println("Liczba oczek      |       Liczebność");
        System.out.println("------------------------------------");
        
        for(int i = 0 ; i< liczbaOczek.length ; i++){
            
            System.out.println("        "  + (i+1) + "         |        " + liczbaOczek[i] );
        }
        
    }
    
}
