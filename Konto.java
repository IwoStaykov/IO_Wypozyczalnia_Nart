public class Konto implements KontoInterface {

	private int KontoID;
	private string Imie;
	private string Nazwisko;
	private string Email;
	private string NumerTelefonu;
	private string Login;
	private string Haslo;
	private RolaKonta Rola;
	private static KontoInterface Konta;

	/**
	 * 
	 * @param KontoID
	 * @param Imie
	 * @param Nazwisko
	 * @param Email
	 * @param NumerTelefonu
	 * @param Login
	 * @param Haslo
	 * @param Rola
	 */
	public void KontoID(int KontoID, string Imie, string Nazwisko, string Email, string NumerTelefonu, string Login, string Haslo, RolaKonta Rola) {
		// TODO - implement Konto.KontoID
		throw new UnsupportedOperationException();
	}

	public int GetKontoID() {
		// TODO - implement Konto.GetKontoID
		throw new UnsupportedOperationException();
	}

	public string GetImie() {
		// TODO - implement Konto.GetImie
		throw new UnsupportedOperationException();
	}

	public void SetImie() {
		// TODO - implement Konto.SetImie
		throw new UnsupportedOperationException();
	}

	public string GetNazwisko() {
		// TODO - implement Konto.GetNazwisko
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param Nazwisko
	 */
	public void SetNazwisko(string Nazwisko) {
		// TODO - implement Konto.SetNazwisko
		throw new UnsupportedOperationException();
	}

	public string GetEmail() {
		// TODO - implement Konto.GetEmail
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param Email
	 */
	public void SetEmail(string Email) {
		// TODO - implement Konto.SetEmail
		throw new UnsupportedOperationException();
	}

	public string GetNumerTelefonu() {
		// TODO - implement Konto.GetNumerTelefonu
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param NumerTelefonu
	 */
	public void SetNumerTelefonu(string NumerTelefonu) {
		// TODO - implement Konto.SetNumerTelefonu
		throw new UnsupportedOperationException();
	}

	public string GetLogin() {
		// TODO - implement Konto.GetLogin
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param Login
	 */
	public void SetLogin(string Login) {
		// TODO - implement Konto.SetLogin
		throw new UnsupportedOperationException();
	}

	public string GetHaslo() {
		// TODO - implement Konto.GetHaslo
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param Haslo
	 */
	public void SetHaslo(string Haslo) {
		// TODO - implement Konto.SetHaslo
		throw new UnsupportedOperationException();
	}

	public RolaKonta getRola() {
		// TODO - implement Konto.getRola
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param Rola
	 */
	public void SetRola(RolaKonta Rola) {
		// TODO - implement Konto.SetRola
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param KontoID
	 * @param Imie
	 * @param Nazwisko
	 * @param Email
	 * @param NumerTelefonu
	 * @param Login
	 * @param Haslo
	 * @param Rola
	 */
	public static void DodajKonto(int KontoID, string Imie, string Nazwisko, string Email, string NumerTelefonu, string Login, string Haslo, RolaKonta Rola) {
		// TODO - implement Konto.DodajKonto
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param KontoID
	 * @param Imie
	 * @param Nazwisko
	 * @param Email
	 * @param NumerTelefonu
	 * @param Login
	 * @param Haslo
	 */
	public void ModyfikujKonto(int KontoID, string Imie, string Nazwisko, string Email, string NumerTelefonu, string Login, string Haslo) {
		// TODO - implement Konto.ModyfikujKonto
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param KontoID
	 */
	public static void UsunKontoKlienta(int KontoID) {
		// TODO - implement Konto.UsunKontoKlienta
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param KontoID
	 */
	public static void UsunKontoPracownika(int KontoID) {
		// TODO - implement Konto.UsunKontoPracownika
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param KontoID
	 */
	public static KontoInterface GetKontoByID(int KontoID) {
		// TODO - implement Konto.GetKontoByID
		throw new UnsupportedOperationException();
	}

}