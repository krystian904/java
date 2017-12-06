
package pkg47;

import java.util.Scanner;

public class pesel {
    String textPob;
    int[] licz = new int[11] ; 
    
    int suma = 0;
    int mod = 0;
    
    boolean poprawny = false;
        
    public pesel(){
        Scanner odczyt = new Scanner(System.in);
        System.out.println("Podaj pesel:");
        textPob = odczyt.nextLine();
        spr();
        pobierz();
        printP();
        ToStringBool();
    }
    public void spr(){
        if(textPob.length()==11){
            System.out.println("dobra dlugosc peselu :");
            
        }
    }
        
    public void pobierz(){
        
        int[] wagi = {1,3,	7	,9	,1	,3	,7	,9	,1	,3};
        for(int i =0 ;i<11;i++){
            String bleble;
            bleble  = textPob.charAt(i)+"";
            licz[i] =   Integer.parseInt(bleble);  //textPob.charAt(i);
            
            
        }
        for(int i =0 ;i<10;i++){
            suma += licz[i]*wagi[i];
            System.out.print(licz[i] );
            System.out.print(" * ");
            System.out.print( wagi[i]);
            System.out.print(" = ");
            System.out.println((licz[i] )* wagi[i]);
        
        }
        mod = 10 -(suma % 10);
        
        
        
        System.out.println(mod);
        
    }
    
    void printP(){
        if(licz[10] == mod){
            poprawny =true;
            
        }else{
            poprawny =false;
            
        }
        
    }
    
    void ToStringBool(){
        if(poprawny == true){
            System.out.println("poprawny pesesel"); }
        else {
            System.out.println("niepoprawny pesesel");}
        
    }
    
}
