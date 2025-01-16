public class KierownikS {
	private KierownikViewMenu viewMenu;
	private OperacjaNaBazieF operacja;
	private ModyfikacjaNaBazieF modyfikacja;

	public KierownikS() {
		viewMenu = new KierownikViewMenu();
		operacja = new OperacjaNaBazieF();
		modyfikacja = new ModyfikacjaNaBazieF();
	}

	public void uruchomMain() {
		int wybranaOperacja;
		do {
			viewMenu.wyswietl();
			wybranaOperacja = viewMenu.wyborOperacji();
			switch (wybranaOperacja) {
				case 1 -> operacja.wyswietlenieBazy();
				case 2 -> operacja.dodanieNowegoKonta();
				case 3 -> modyfikacja.usuniecieKontaKlienta();
				case 4 -> modyfikacja.usuniecieKontaPracownika();
				case 5 -> System.out.println("Zamykam menu...");
				default -> System.out.println("Nieprawidłowa opcja, spróbuj ponownie.");
			}
		} while (wybranaOperacja != 5);
	}

	public static void main(String[] args) {
		KierownikS kierownik = new KierownikS();
		kierownik.uruchomMain();
	}
}
