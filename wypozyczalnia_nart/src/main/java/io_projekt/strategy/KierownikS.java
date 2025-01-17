import io_projekt.view.KierownikView;
import io_projekt.fasada.OperacjaNaBazieF;
import io_projekt.fasada.ModyfikacjaNaBazieF;

public class KierownikS {
	private KierownikView viewMenu;
	private OperacjaNaBazieF operacja;
	private ModyfikacjaNaBazieF modyfikacja;

	public KierownikS() {
		viewMenu = new KierownikViewMenu();
		operacja = new OperacjaNaBazieF();
		modyfikacja = new ModyfikacjaNaBazieF();
	}

	public void uruchomMain() {
		int WybranaOperacja;
		do {
			viewMenu.wyswietl();
			WybranaOperacja = viewMenu.wyborOperacji();
			switch (WybranaOperacja) {
				case 1 -> operacja.WyswietlenieBazy();
				case 2 -> operacja.DodanieNowegoKonta();
				case 3 -> modyfikacja.UsuniecieKontaKlienta();
				case 4 -> modyfikacja.UsuniecieKontaPracownika();
				case 5 -> System.out.println("Zamykam menu...");
				default -> System.out.println("Nieprawidłowa opcja, spróbuj ponownie.");
			}
		} while (WybranaOperacja != 5);
	}

	public static void main(String[] args) {
		KierownikS kierownik = new KierownikS();
		kierownik.uruchomMain();
	}
}
