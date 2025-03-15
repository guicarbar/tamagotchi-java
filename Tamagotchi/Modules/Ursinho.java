package Tamagotchi.Modules;

// import resorces
import Tamagotchi.Resorces.MetodsResources;
import Tamagotchi.Modules.Wallet;

// bibliotecas
import java.util.Scanner;

public class Ursinho extends Games {
    // switch bet
    public static void switchBet(int bet) {
        // set value
        Double valueBet = 0.0;

        switch (bet) {
            case 1:
                valueBet = 5.00;
                break;
            case 2:
                valueBet = 10.00;
                break;
            case 3:
                valueBet = 15.00;
                break;
            case 4:
                valueBet = 20.00;
                break;
            default:
                System.out.println("é necesario escolher uma opçao!");
                break;
        }

        if (!Wallet.haveMoney(valueBet)) {
            // comer comida
        } else {
            // esculacho por ser falido
        }
    }

    // iniciando game
    public static void ursinhoGame() {
        // inicializador do ursinho
        MetodsResources.timer(5, 3);

        // inicando o scanner
        Scanner sc = new Scanner(System.in);

        System.out.println("Qunato deseja apostar hoje ?\n1. RS5,00\n2. RS10,oo\n3. 3. RS15,oo\n4. RS20,00\n5. Voltar");
        String valueOptions = sc.nextLine();

        if (MetodsResources.isConvertibleToInt(valueOptions) == 1) {
            System.out.println("É necessario escolher uma opção");
        } else if (MetodsResources.isConvertibleToInt(valueOptions) == 2) {
            //pega a escolha de comida
            int valueBet = Integer.parseInt(valueOptions);

            // verifica se o player nn quer voltar
            if (valueBet == 5) {
                // voltar pro menu
            } else {
                switchBet(valueBet);
            }
        } else if (MetodsResources.isConvertibleToInt(valueOptions) == 3) {
            System.out.println("Digite apenas numeros");
        } else {
            System.out.println("Opção invalida!");
        }
    }
}
