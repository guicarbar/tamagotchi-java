package Tamagotchi.Modules;

import java.util.Scanner;

public class Job extends Wallet {
    // work
    public static void Work() {
        Wallet.addCash(80.00);
        System.out.println("\nApós 8 horas de trabalho su recompensa é 80 Reais!\n");
    }

    // work init
    public static void workInit() {
        // inicia o scanner
        Scanner sc = new Scanner(System.in);

        System.out.println("\nQuer ir trabalhar agora ? Y ou N (Yes or Not)\n");
        // yes or not
        String acept = sc.nextLine();

        if (acept == "y" || acept == "Y" || acept == "Yes" || acept == "yes") {
            // aceitar
        } else {
            System.out.println("\nEscolha apenas Y ou N\n");
        }
    }
}
