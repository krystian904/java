/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg17;

/**
 *
 * @author user
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       String nazwaOperacji = "Obliczanie podatku VAT";
        double stawkaVAT;
        double podatekVAT;
        double kwotaBrutto;
        double kwotaNetto = 231.74;
        stawkaVAT = 0.22;
        podatekVAT = kwotaNetto * stawkaVAT;
        kwotaBrutto = kwotaNetto + podatekVAT;
        System.out.println(nazwaOperacji);
        System.out.println("-------------------------------");
        System.out.println("Kwota netto = " + kwotaNetto);
        System.out.println("Stawka VAT = " + stawkaVAT);
        System.out.println("Podatek VAT = " + podatekVAT);
        System.out.println("Kwota brutto = " + kwotaBrutto);
        }
    }
    

