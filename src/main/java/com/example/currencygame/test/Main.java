package com.example.currencygame.test;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        currencyChecking();

    }

    private static int quantity = 0;

    public static void currencyChecking() {
        Random random = new Random();

        boolean is = true;

        int currencyRandom = random.nextInt(10) + 1;

        Scanner scanner = new Scanner(System.in);


        do {
            quantity += 1;

            System.out.println("Odgadnij liczbe: ");
            int currency = scanner.nextInt();

            if (currency > currencyRandom) {
                String format = String.format("Podałeś za dużą liczbę");
                System.out.println(format);
            } else if (currency < currencyRandom) {
                String format = String.format("Podałeś za małą liczbę");
                System.out.println(format);
            } else if (currency == currencyRandom) {
                String format = String.format("Gratulacje, udało ci się za: %s razem", quantity);
                System.out.println(format);
                is = false;
            }
        } while (is);
    }
}
    public String currencyChecking(int currency) {

        int currencyRandom = new Random().nextInt(10);

//        double currencyRandom = getCurrencyRandom();
        System.out.println("Random: " + currencyRandom);
        System.out.println("User: " + currency);
        boolean  isExitFromLoop = true;
        String play_again = new String();

        do {
            quantity += 1;

            if (currency > currencyRandom) {
                String format = String.format("Podałeś za dużą liczbę");
                format = play_again;
            } else if (currency < currencyRandom) {
                String format = String.format("Podałeś za małą liczbę");
                format = play_again;
            } else if (currency == currencyRandom) {
                String format = String.format("Gratulacje, udało ci się za: %s razem", quantity);
                isExitFromLoop = false;
                format = play_again;
            }
        } while (isExitFromLoop);
        return play_again;
    }
