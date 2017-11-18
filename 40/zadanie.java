import java.util.Scanner;
public class zadanie {
public static void main(String[] args) {
long silnia = 1;
/* odczytaj dane z konsoli */
Scanner sc = new Scanner(System.in);
System.out.print("Liczba naturalna (1..20): ");
int n = sc.nextInt();
/* oblicz wartoœæ silni */
for (int i=1; i<=n; i++) {
silnia *= i;
}
/* wyœwietl rezultaty */
System.out.println(n + "! = " + silnia);
}
}