import java.util.Scanner;
public class zadanie {
public static void main(String[] args) {
char znak;
Scanner sc = new Scanner(System.in);
/* wprowadzenie ci¹gu znaków */
System.out.print("liczba naturalna: ");
String liczba = sc.nextLine();
/* sprawdzenie, czy ka¿dy znak ci¹gu jest cyfr¹ */
boolean liczbaOK = true;
for (int i=0; i<liczba.length(); i++) {
znak = liczba.charAt(i);
if (!Character.isDigit(znak))
liczbaOK = false;
}
/* podanie rezultatów */
if (liczbaOK) {
System.out.printf("ci¹g \'%s\' jest liczb¹",liczba);
} else {
System.out.printf("ci¹g \'%s\' nie jest liczb¹",liczba);
}
}
}