
package pkg53;

import java.util.Random;
public class Main {


    public static void main(String[] args) {
       Random random = new Random();
       
       for(int i = 0 ;i<21;i++){
           System.out.print(i + " = ");
           System.out.println(random.nextInt(15)-20);
           
       }
       
    }
    
}
