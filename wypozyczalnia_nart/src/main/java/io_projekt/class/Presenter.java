import io_projekt.interface.MenuViewInterface;

public class Presenter {

	private static MenuViewInterface start;
	private PracownikS menu;
	
	public Presenter() {
		menu = new PracownikS();
	}

	public static void main() {
		Presenter presenter = new Presenter();
		presenter.uzycieMenu();
		System.out.println("Witaj w wypożyczalni nart!");
		throw new UnsupportedOperationException();
	}
	
	/**
	 * 
	 * @param menu
	 */
	public static void SetMenu(MenuS menu) {
		System.out.println("Ustawiam menu...");
		throw new UnsupportedOperationException();
	}

	public static void UzycieMenu() {
		System.out.println("Użycie menu...");
		menu.uruchomMain();
		throw new UnsupportedOperationException();
	}
}