/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg22;

/**
 *
 * @author user
 */
import java.text.MessageFormat;
import java.util.Date;
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String s;
        Date teraz = new Date();
        String miejsce = "Kraków";
        int mila = 1852;
        double vat = 0.22;
        double cena = 31560.76;
     
        
        System.out.printf("Tu %s - jest godzina %tR\n", "Radio Kraków", teraz);
        String tekst = String.format("%s %s", "Java", "Virtual Machine");
        System.out.println(tekst);
    }
    
}
