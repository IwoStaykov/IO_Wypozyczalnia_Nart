public interface KontoInterface {

	int GetKontoID();

	int GetImie();

	void SetImie();

	string GetNazwisko();

	/**
	 * 
	 * @param Nazwisko
	 */
	void SetNazwisko(string Nazwisko);

	string GetEmail();

	/**
	 * 
	 * @param Email
	 */
	void SetEmail(string Email);

	string GetNumerTelefonu();

	/**
	 * 
	 * @param NumerTelefonu
	 */
	void SetNumerTelefonu(string NumerTelefonu);

	string GetLogin();

	/**
	 * 
	 * @param Login
	 */
	void SetLogin(string Login);

	string GetHaslo();

	/**
	 * 
	 * @param Haslo
	 */
	void SetHaslo(string Haslo);

	RolaKonta GetRola();

	/**
	 * 
	 * @param Rola
	 */
	void SetRola(RolaKonta Rola);

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
	static void DodajKonto(int KontoID, string Imie, string Nazwisko, string Email, string NumerTelefonu, string Login, string Haslo, RolaKonta Rola);

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
	void ModyfikujKonto(int KontoID, string Imie, string Nazwisko, string Email, string NumerTelefonu, string Login, string Haslo);

	/**
	 * 
	 * @param KontoID
	 */
	static void UsunKontoKlienta(int KontoID);

	/**
	 * 
	 * @param KontoID
	 */
	static void UsunKontoPracownika(int KontoID);

	/**
	 * 
	 * @param KontoID
	 */
	static KontoInterface GetKontoByID(int KontoID);

}