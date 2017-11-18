import java.util.Scanner;
public class zadanie {
public static void main(String[] args) {
int liczbaNaturalna; // analizowana wartoœæ
/* pobierz liczbê z konsoli */
Scanner sc = new Scanner(System.in);
System.out.print("WprowadŸ dowoln¹ liczbê naturaln¹: ");
liczbaNaturalna = sc.nextInt();
/* sprawdŸ, czy liczba jest parzysta (podzielna przez 2 bez reszty) */
boolean liczbaParzysta = liczbaNaturalna % 2 == 0 ? true : false;
/* wyœwietl rezultat na konsoli */
if (liczbaParzysta) {
System.out.printf("Liczba %d jest parzysta", liczbaNaturalna);
} else {
System.out.printf("Liczba %d jest nieparzysta", liczbaNaturalna);
}
}
}