package Tamagotchi.Modules;

// import resorces
import Tamagotchi.Resorces.MetodsResources;
import Tamagotchi.Modules.Wallet;

// bibliotecas
import java.util.Scanner;

public class Ursinho extends Games {
    // compar by luck
    // azar
    public static void azar(int sorterNumber) {
        if (0 <= sorterNumber && sorterNumber < 8 ) {
            // perde
        } else {
            // ganha
        }
    }

    // neutro
    public static void neutro(int sorterNumber) {
        if (0 <= sorterNumber && sorterNumber <= 5 ) {
            // perde
        } else {
            // ganha
        }
    }

    // sorte
    public static void sorte(int sorterNumber) {
        if (0 <= sorterNumber && sorterNumber < 4 ) {
            // perde
        } else {
            // ganha
        }
    }


    // in game tigriinho
    public static void inGame(int sorterNumber) {
        if (luck == 0) {
            // azar
            azar(sorterNumber);
        } else if (luck == 1) {
            // neutro
            neutro(sorterNumber);
        } else {
            // sorte
            sorte(sorterNumber);
        }
    }


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
                System.out.println("\nDigite apenas uma das opções disponiveis!\n");
                break;
        }

        if (Wallet.haveMoney(valueBet) == true) {
            // remove o dinheiro da carteira
            Wallet.removeCash(valueBet);

            // jogar no tigrinho
            inGame(MetodsResources.ramndomNumberForLuck(10));
        } else {
            // esculacho por ser falido
            System.out.println("\nVocê não tem dinheiro e quer apostar ? Vai trabalhar!\n");
        }
    }

    // iniciando game
    public static void ursinhoGame() {
        // inicando o scanner
        Scanner sc = new Scanner(System.in);

        System.out.println("\nQunato deseja apostar hoje ?\n\n1. RS5,00\n2. RS10,oo\n3. RS15,oo\n4. RS20,00\n5. Voltar");
        String valueOptions = sc.nextLine();

        if (MetodsResources.isConvertibleToInt(valueOptions) == 1) {
            System.out.println("\nÉ necessario escolher uma opção\n");
        } else if (MetodsResources.isConvertibleToInt(valueOptions) == 2) {
            //pega a escolha de comida
            int valueBet = Integer.parseInt(valueOptions);

            // verifica se o player nn quer voltar
            if (valueBet == 5) {
                // voltar pro menu
                System.out.println("\nVoltando para o menu de games!\n");
            } else {
                switchBet(valueBet);
            }
        } else if (MetodsResources.isConvertibleToInt(valueOptions) == 3) {
            System.out.println("\nDigite apenas numeros\n");
        } else {
            System.out.println("\nOpção invalida!\n");
        }
    }
}
