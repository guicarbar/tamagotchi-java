package Tamagotchi.Modules;

import java.util.Scanner;

public class Job extends Wallet {
    // work
    public static void work() {
        Wallet.addCash(30.00);
        Status.reduxPerAction(30,40,40);
        System.out.println("\nApós 8 horas de trabalho sua recompensa é 30 Reais!\n");
    }

    // work init
    public static void workInit() {
        // inicia o scanner
        Scanner sc = new Scanner(System.in);

        // yes or not
        System.out.println("\nQuer ir trabalhar agora ? Y ou N (Yes or Not)\n");
        String acept = sc.nextLine();

        if (acept.equalsIgnoreCase("y") || acept.equalsIgnoreCase("yes")) {
            // aceitar
            work();
        } else {
            System.out.println("\nEscolha apenas Y ou N\n");
        }
    }
}
