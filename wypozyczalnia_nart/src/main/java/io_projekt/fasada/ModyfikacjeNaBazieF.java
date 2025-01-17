public class ModyfikacjeNaBazieF {

	public static void UsuniecieKontaKlienta() {
		int idToDelete;
		System.out.println("Podaj ID konta do usunięcia: ");
		System.in.read(idToDelete);
		System.out.println("Usuwanie konta klienta o ID " + String.valueOf(idToDelete));
	}

	public static void UsuniecieKontaPracownika() {
		int idToDelete;
		System.out.println("Podaj ID konta do usunięcia: ");
		System.in.read(idToDelete);
		System.out.println("Usuwanie konta pracownika o ID " + String.valueOf(idToDelete));
	}

}