import java.util.ArrayList;
import java.util.List;

public class Konto implements KontoInterface {

    private int KontoID;
    private String Imie;
    private String Nazwisko;
    private String Email;
    private String NumerTelefonu;
    private String Login;
    private String Haslo;
    private RolaKonta Rola;
    private static List<Konto> Konta = new ArrayList<>();

    public Konto(int KontoID, String Imie, String Nazwisko, String Email, String NumerTelefonu, String Login, String Haslo, RolaKonta Rola) {
        this.KontoID = KontoID;
        this.Imie = Imie;
        this.Nazwisko = Nazwisko;
        this.Email = Email;
        this.NumerTelefonu = NumerTelefonu;
        this.Login = Login;
        this.Haslo = Haslo;
        this.Rola = Rola;
    }

    public int GetKontoID() {
        return KontoID;
    }

    public String GetImie() {
        return Imie;
    }

    public void SetImie(String Imie) {
        this.Imie = Imie;
    }

    public String GetNazwisko() {
        return Nazwisko;
    }

    public void SetNazwisko(String Nazwisko) {
        this.Nazwisko = Nazwisko;
    }

    public String GetEmail() {
        return Email;
    }

    public void SetEmail(String Email) {
        this.Email = Email;
    }

    public String GetNumerTelefonu() {
        return NumerTelefonu;
    }

    public void SetNumerTelefonu(String NumerTelefonu) {
        this.NumerTelefonu = NumerTelefonu;
    }

    public String GetLogin() {
        return Login;
    }

    public void SetLogin(String Login) {
        this.Login = Login;
    }

    public String GetHaslo() {
        return Haslo;
    }

    public void SetHaslo(String Haslo) {
        this.Haslo = Haslo;
    }

    public RolaKonta GetRola() {
        return Rola;
    }

    public void SetRola(RolaKonta Rola) {
        this.Rola = Rola;
    }

    public static void DodajKonto(int KontoID, String Imie, String Nazwisko, String Email, String NumerTelefonu, String Login, String Haslo, RolaKonta Rola) {
        Konto konto = new Konto(KontoID, Imie, Nazwisko, Email, NumerTelefonu, Login, Haslo, Rola);
        Konta.add(konto);
    }

    public void ModyfikujKonto(int KontoID, String Imie, String Nazwisko, String Email, String NumerTelefonu, String Login, String Haslo) {
        this.KontoID = KontoID;
        this.Imie = Imie;
        this.Nazwisko = Nazwisko;
        this.Email = Email;
        this.NumerTelefonu = NumerTelefonu;
        this.Login = Login;
        this.Haslo = Haslo;
    }

    public static void UsunKontoKlienta(int KontoID) {
        Konta.removeIf(konto -> konto.GetKontoID() == KontoID && konto.GetRola() == RolaKonta.KLIENT);
    }

    public static void UsunKontoPracownika(int KontoID) {
        Konta.removeIf(konto -> konto.GetKontoID() == KontoID && konto.GetRola() == RolaKonta.PRACOWNIK);
    }

    public static Konto GetKontoByID(int KontoID) {
        return Konta.stream().filter(konto -> konto.GetKontoID() == KontoID).findFirst().orElse(null);
    }
}