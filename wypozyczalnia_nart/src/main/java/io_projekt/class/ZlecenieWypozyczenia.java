public class ZlecenieWypozyczenia implements ZlecenieWypozyczeniaInterface {

	private int ID;
	private Konto KontoID;
	private SprzetSportowy SprzetID;
	private string RozpoczecieWypozyczenia;
	private string ZakonczenieWypozyczenia;
	private float OplataZaWypozyczenie;
	private float DodatkowaOplata;
	private bool StanZlecenia;
	private static ZlecenieWypozyczeniaInterface[] Zlecenia;

	public string getRozpoczecieWypozyczenia() {
		return this.RozpoczecieWypozyczenia;
	}

	public void setRozpoczecieWypozyczenia(string RozpoczecieWypozyczenia) {
		this.RozpoczecieWypozyczenia = RozpoczecieWypozyczenia;
	}

	/**
	 * 
	 * @param ID
	 * @param KontoID
	 * @param SprzetID
	 * @param RozpoczecieWypozyczenia
	 * @param ZakonczenieWypozyczenia
	 * @param OplataZaWypozyczenie
	 * @param DodatkowaOplata
	 * @param StanZlecenia
	 */
	public ZlecenieWypozyczenia(int ID, int KontoID, int SprzetID, string RozpoczecieWypozyczenia, string ZakonczenieWypozyczenia, int OplataZaWypozyczenie, int DodatkowaOplata, bool StanZlecenia) {
		// TODO - implement ZlecenieWypozyczenia.ZlecenieWypozyczenia
		throw new UnsupportedOperationException();
	}

	public int GetID() {
		// TODO - implement ZlecenieWypozyczenia.GetID
		throw new UnsupportedOperationException();
	}

	public int GetKontoID() {
		// TODO - implement ZlecenieWypozyczenia.GetKontoID
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param KontoID
	 */
	public void SetKontoID(int KontoID) {
		// TODO - implement ZlecenieWypozyczenia.SetKontoID
		throw new UnsupportedOperationException();
	}

	public string GetRozpoczecieWypozyczenia() {
		// TODO - implement ZlecenieWypozyczenia.GetRozpoczecieWypozyczenia
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param RozpoczecieWypozyczenia
	 */
	public void SetRozpoczecieWypozyczenia(string RozpoczecieWypozyczenia) {
		// TODO - implement ZlecenieWypozyczenia.SetRozpoczecieWypozyczenia
		throw new UnsupportedOperationException();
	}

	public string GetZakonczenieWypozyczenia() {
		// TODO - implement ZlecenieWypozyczenia.GetZakonczenieWypozyczenia
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param ZakonczenieWypozyczenia
	 */
	public void SetZakonczenieWypozyczenia(string ZakonczenieWypozyczenia) {
		// TODO - implement ZlecenieWypozyczenia.SetZakonczenieWypozyczenia
		throw new UnsupportedOperationException();
	}

	public float GetOplataZaWypozyczenie() {
		// TODO - implement ZlecenieWypozyczenia.GetOplataZaWypozyczenie
		throw new UnsupportedOperationException();
	}

	public float GetDodatkowaOplata() {
		// TODO - implement ZlecenieWypozyczenia.GetDodatkowaOplata
		throw new UnsupportedOperationException();
	}

	public bool GetStanZlecenia() {
		// TODO - implement ZlecenieWypozyczenia.GetStanZlecenia
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param StanZlecenia
	 */
	public void SetStanZlecenia(bool StanZlecenia) {
		// TODO - implement ZlecenieWypozyczenia.SetStanZlecenia
		throw new UnsupportedOperationException();
	}

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
	public static void DodajZlecenieWypozyczenia(int KontoID, int SprzetID, string RozpoczecieWypozyczenia, string ZakonczenieWypozyczenia, float OplataZaWypozyczenie, float DodatkowaOplata, bool StanZlecenia) {
		// TODO - implement ZlecenieWypozyczenia.DodajZlecenieWypozyczenia
		throw new UnsupportedOperationException();
	}

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
	public void ModyfikujZlecenie(string KontoID, int SprzetID, string RozpoczecieWypozyczenia, string ZakonczenieWypozyczenia, float OplataZaWypozyczenie, float DodatkowaOplata, bool StanZlecenia) {
		// TODO - implement ZlecenieWypozyczenia.ModyfikujZlecenie
		throw new UnsupportedOperationException();
	}

}