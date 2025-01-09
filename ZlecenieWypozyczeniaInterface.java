public interface ZlecenieWypozyczeniaInterface {

	int GetID();

	int GetKontoID();

	/**
	 * 
	 * @param KontoID
	 */
	void SetKontoID(int KontoID);

	string GetRozpoczecieWypozyczenia();

	/**
	 * 
	 * @param RozpoczecieWypozyczenia
	 */
	void SetRozpoczecieWypozyczenia(string RozpoczecieWypozyczenia);

	string GetZakonczenieWypozyczenia();

	/**
	 * 
	 * @param ZakonczenieWypozyczenia
	 */
	void SetZakonczenieWypozyczenia(string ZakonczenieWypozyczenia);

	float GetOplataZaWypozyczenie();

	float GetDodatkowaOplata();

	bool GetStanZlecenia();

	/**
	 * 
	 * @param StanZlecenia
	 */
	void SetStanZlecenia(bool StanZlecenia);

	/**
	 * 
	 * @param KontoID
	 * @param SprzetID
	 * @param RozpoczecieWypozyczenia
	 * @param ZakonczenieWypozyczenia
	 * @param OplataZaWypozyczenie
	 * @param DodatkowaOplata
	 * @param StanZlecenia
	 */
	static void DodajZlecenieWypozyczenia(int KontoID, int SprzetID, string RozpoczecieWypozyczenia, string ZakonczenieWypozyczenia, float OplataZaWypozyczenie, float DodatkowaOplata, bool StanZlecenia);

	/**
	 * 
	 * @param KontoID
	 * @param SprzetID
	 * @param RozpoczecieWypozyczenia
	 * @param ZakonczenieWypozyczenia
	 * @param OplataZaWypozyczenie
	 * @param DodatkowaOplata
	 * @param StanZlecenia
	 */
	void ModyfikujZlecenie(string KontoID, int SprzetID, string RozpoczecieWypozyczenia, string ZakonczenieWypozyczenia, float OplataZaWypozyczenie, float DodatkowaOplata, bool StanZlecenia);

}