import java.util.Scanner;
public class zadanie {
public static void main(String[] args) {
char znak;
Scanner sc = new Scanner(System.in);
/* wprowadzenie ci�gu znak�w */
System.out.print("liczba naturalna: ");
String liczba = sc.nextLine();
/* sprawdzenie, czy ka�dy znak ci�gu jest cyfr� */
boolean liczbaOK = true;
for (int i=0; i<liczba.length(); i++) {
znak = liczba.charAt(i);
if (!Character.isDigit(znak))
liczbaOK = false;
}
/* podanie rezultat�w */
if (liczbaOK) {
System.out.printf("ci�g \'%s\' jest liczb�",liczba);
} else {
System.out.printf("ci�g \'%s\' nie jest liczb�",liczba);
}
}
}