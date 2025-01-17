public class OperacjaNaBazieF {

	public void WyswietlenieBazy() {
        System.out.println("Wyświetlam bazę danych...");
        System.out.println("Lista kont: [Przykładowe dane kont]");
    }

	public static void ModyfikacjaKonta(boolean czyKlient) {
		if(czyKlient) {
			System.out.println("Modyfikacja konta klienta...");
		} else {
			System.out.println("Modyfikacja konta pracownika...");
		}
	}

	public static void DodanieNowegoKonta() {
		int newID;
		String name, surname, email, phone, login, password, role;
		System.out.println("Podaj ID nowego konta: ");
		System.in.read(newID);
		System.out.println("Podaj imię: ");
		System.in.read(name);
		System.out.println("Podaj nazwisko: ");
		System.in.read(surname);
		System.out.println("Podaj email: ");
		System.in.read(email);
		System.out.println("Podaj numer telefonu: ");
		System.in.read(phone);
		System.out.println("Podaj login: ");
		System.in.read(login);
		System.out.println("Podaj hasło: ");
		System.in.read(password);
		System.out.println("Podaj rolę: ");
		System.in.read(role);
		System.out.println("Dodawanie nowego konta...");
		KontoInterface noweKonto = new Konto(newID, name, surname, email, phone, login, password, role);
	}
}