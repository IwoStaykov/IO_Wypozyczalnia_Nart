package io_projekt.view;

import java.util.Scanner;

import io_projekt.interface.MenuViewInterface;

public class PracownikView implements MenuViewInterface {
    private final Scanner scanner;

    public PracownikView() {
        scanner = new Scanner(System.in);
    }

    public void wyswietl() {
        System.out.println("Menu:");
        System.out.println("1. Utworzenie nowego zlecenia");
        System.out.println("5. Wyjście");
        System.out.print("Wybierz operację: ");
    }

    public int wyborOperacja() {
        return scanner.nextInt();
    }

}