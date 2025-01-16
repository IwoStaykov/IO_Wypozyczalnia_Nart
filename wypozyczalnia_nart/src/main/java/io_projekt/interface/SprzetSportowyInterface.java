public interface SprzetSportowyInterface {

	int GetSprzetID();

	string GetFirma();

	/**
	 * 
	 * @param Firma
	 */
	void SetFirma(string Firma);

	string GetModel();

	/**
	 * 
	 * @param Model
	 */
	void SetModel(string Model);

	int GetIloscWypozyczen();

	/**
	 * 
	 * @param IloscWypozyczen
	 */
	void SetIloscWypozyczen(int IloscWypozyczen);

	string GetDataOstatniejKonserwacji();

	/**
	 * 
	 * @param DataOstatniejKonserwacji
	 */
	void SetDataOstatniejKonserwacji(string DataOstatniejKonserwacji);

	bool GetStanDostepnosci();

	/**
	 * 
	 * @param StanDostepnosci
	 */
	void SetStanDostepnosci(bool StanDostepnosci);

	float GetCenaZaDzienWypozyczenia();

	/**
	 * 
	 * @param CenaZadzienWypozyczenia
	 */
	void SetCenaZaDzienWypozyczenia(float CenaZadzienWypozyczenia);

	/**
	 * 
	 * @param SprzetID
	 * @param Firma
	 * @param Model
	 * @param IloscWypozyczen
	 * @param DataOstatniejKonserwacji
	 * @param StaNDostepnosci
	 * @param CenaZaDzienWypozyczenia
	 */
	void ModyfikujSprzet(int SprzetID, string Firma, string Model, int IloscWypozyczen, string DataOstatniejKonserwacji, bool StaNDostepnosci, float CenaZaDzienWypozyczenia);

	static SprzetSportowyInterface GetBySprzetID();

}