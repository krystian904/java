import java.util.Scanner;
public class zadanie {
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
// odczytaj warto�� temperatury w stopniach Celsjusza
System.out.print("Podaj warto�� temperatury w stopniach Celsjusza: ");
double tempC = sc.nextInt(); // Celsjusz
// oblicz warto�� temperatury na pozosta�ych skalach
double tempF = 32 + (9/5d)*tempC; // Fahrenheit
double tempK = tempC + 273.15; // Kelvin
// wy�wietl rezultaty oblicze�, z dok�adno�ci� do pe�nych stopni
System.out.println("* temperatura w stopniach C: " + (int)tempC);
System.out.println("* temperatura w stopniach F: " + (int)tempF);
System.out.println("* temperatura w stopniach K: " + (int)tempK);
}
}