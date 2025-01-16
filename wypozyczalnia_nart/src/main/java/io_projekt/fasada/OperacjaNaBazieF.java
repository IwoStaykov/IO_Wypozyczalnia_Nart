public class OperacjaNaBazieF {

	public void wyswietlenieBazy() {
        System.out.println("Wyświetlam bazę danych...");
        // Logika do wyświetlania listy kont
        System.out.println("Lista kont: [Przykładowe dane kont]");
    }

	public static void ModyfikacjaKonta(boolean czyKlient) {
		System.out.println("Modyfikacja konta...");
		throw new UnsupportedOperationException();
	}

	public static void DodanieNowegoKonta() {
		System.out.println("Dodawanie nowego konta...");
		KontoInterface noweKonto = new Konto();
		throw new UnsupportedOperationException();
	}

	public static void PrzegladanieKont() {
		System.out.println("Przegladanie kont");
		throw new UnsupportedOperationException();
	}

}