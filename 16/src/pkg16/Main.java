/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg16;

/**
 *
 * @author user
 */
import java.util.Scanner;
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        final double STAWKAVAT = 1.22;
        double KwotaNetto, Kwotabrutto;
        Scanner SK = new Scanner(System.in);
        System.out.print ("Podaj kwotę netto: ");
        KwotaNetto = SK.nextDouble();
        Kwotabrutto = KwotaNetto * STAWKAVAT;
        System.out.println ("Kwota Netto: " + KwotaNetto + " Kwota brutto: " +  Kwotabrutto);
    }
}
