public class KierownikS implements MenuS {

	private MenuViewInterface ViewMenu;

	@java.lang.Override
	public void UruchomMain() {
		ViewMenu.wyswietl();
		int WybranaOperacja = 0;
		while(WybranaOperacja != 5){
			switch (WybranaOperacja){
				case 1:
					OperacjaNaBazieF.PrzegladanieKont();
					break;
				case 2:
					OperacjaNaBazieF.DodanieNowegoKonta();
					break;
				case 3: // Usunięcie konta Klienta
					OperacjaNaBazieF.ModyfikacjaKonta(true);
					break;
				case 4: // Usunięcie konta Pracownika
					OperacjaNaBazieF.ModyfikacjaKonta(false);
					break;
			}
		}
	}
}