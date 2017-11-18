/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg19;

/**
 *
 * @author user
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[] dniTygodnia = {"Poniedziałek", "Wtorek", "Środa", "Czwartek",
        "Piątek", "Sobota", "Niedziela"};
        System.out.println ("Pierwszy dzień tygodnia to: " + dniTygodnia[7]);
        System.out.println ("Dni wolne od pracy to: " + dniTygodnia[7] + ", " +
        dniTygodnia[7]);
    }
//      Bład konsoli to 
//    Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 7
//        at pkg19.Main.main(Main.java:20)
//C:\Users\user\AppData\Local\NetBeans\Cache\8.2\executor-snippets\run.xml:53: Java returned: 1
//BUILD FAILED (total time: 0 seconds)

    
}
