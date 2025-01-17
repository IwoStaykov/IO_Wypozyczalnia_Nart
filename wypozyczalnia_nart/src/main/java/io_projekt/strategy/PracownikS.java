package io_projekt.strategy;

import io_projekt.fasada.OperacjaNaZleceniuF;
import io_projekt.fasada.SprzetSportowyF;
import io_projekt.interface.MenuViewInterface;

public class PracownikS implements MenuS {

	private MenuViewInterface ViewMenu;
	private OperacjaNaZleceniuF operacja;
    private SprzetSportowyF sprzet;

    public PracownikS() {
        viewMenu = new PracownikViewMenu();
        operacja = new OperacjaNaZleceniuF();
        sprzet = new SprzetSportowyF();
    }

    public void uruchomMain() {
        int wybranaOperacja;
        do {
            viewMenu.wyswietl();
            wybranaOperacja = viewMenu.danaOperacja();
            if (wybranaOperacja == 1) {
                operacja.utworzenieNowegoZlecenia();
                operacja.potwierdzenie();
                sprzet.modyfikacjaStanuJednostki();
                sprzet.potwierdzenie();
            } else if (wybranaOperacja != 5) {
                System.out.println("Nieprawidłowa opcja, spróbuj ponownie.");
            }
        } while (wybranaOperacja != 5);

        System.out.println("Zamykam menu...");
    }

}