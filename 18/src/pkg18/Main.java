/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg18;

/**
 *
 * @author user
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[] jednostki = {"kg", "cd", "s", "A", "K", "mol", "m"};
        System.out.println("Jednostki podstawowe układu SI");
        System.out.println("=================================");
        System.out.println("Jednostka temperatury (kelvin): " + jednostki[4]);
        System.out.println("Jednostka masy (kilogram): " + jednostki[0]);
        System.out.println("Jednostka długości (metr): " + jednostki[jednostki.length-1]);
        System.out.println("---------------------------------");
        System.out.println("Liczba jednostek: " + jednostki.length);
    }
    
}
