/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg21;

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
    s = MessageFormat.format("{0}, {1,date,full}, godz. {1,time,short}",
    miejsce, teraz);
    System.out.println(s);
    s = MessageFormat.format("{0}kB to {1}B", 256,256*1024);
    System.out.println(s);
    s = MessageFormat.format("{0} x {0} x {0} = {1}", 7, 7*7*7);
    System.out.println(s);
    s = MessageFormat.format("{0,number,currency} + VAT({1,number,percent})",
    cena, vat);
    System.out.println(s);
    s = MessageFormat.format("{0} {1} to w przybliżeniu {2}m", 1,
    "mila morska", mila);
    System.out.println(s);
    }
    
}
