// KierownikViewMenu.java
import java.util.Scanner;

public class KierownikView implements MenuViewInterface {
	private final Scanner scanner;

	public KierownikView() {
		scanner = new Scanner(System.in);
	}

	public void wyswietl() {
		System.out.println("Menu:");
		System.out.println("1. Wyświetlenie bazy");
		System.out.println("2. Dodanie nowego konta");
		System.out.println("3. Usunięcie konta klienta");
		System.out.println("4. Usunięcie konta pracownika");
		System.out.println("5. Wyjście");
		System.out.print("Wybierz operację: ");
	}

	public int wyborOperacji() {
		return scanner.nextInt();
	}
}
