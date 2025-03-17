package Tamagotchi.Modules;

import java.util.Scanner;

public class Job extends Wallet {
    // work
    public static void Work() {
        Wallet.addCash(80.00);
        System.out.println("Após 8 horas de trabalho su recompensa é 80 Reais!");
    }

    // work init
    public static void workInit() {
        // inicia o scanner
        Scanner sc = new Scanner(System.in);

        System.out.println("Quer ir trabalhar agora ? Y ou N (Yes or Not)");
        // yes or not
        String acept = sc.nextLine();

        if (acept == "y" || acept == "Y" || acept == "Yes" || acept == "yes") {
            // aceitar
        } else {
            System.out.println("Escolha apenas Y ou N");
        }
    }
}
