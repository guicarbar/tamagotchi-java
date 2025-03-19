package Tamagotchi.Modules;

// import resorces
import Tamagotchi.Resorces.CatchName;
import Tamagotchi.Resorces.MetodsResources;


// import biblioteca
import java.util.Scanner;


public class Games {
    // luck of tamagotchi
    static int luck;

    // switch game selected
    public static void switchGame(int game) {
        switch (game) {
            case 1:
                // console
                System.out.println("\nApós 7 horas jogando! " + CatchName.getName() + " se cansou e decidiu parar!\n");
                HappyGames.console();
                break;
            case 2:
                // computador
                System.out.println("\nApós 5 horas jogando! " + CatchName.getName() + " se cansou e decidiu parar!\n");
                HappyGames.computador();
                break;
            case 3:
                Ursinho.ursinhoGame();
                break;
            default:
                System.out.println("Digite apenas uma das opções disponiveis!");
                break;
        }
    }


    // metodo pra escolher o game pra rodar
    public static void selectGame() {
        // setta um valor novo pra luck toda vez que for jogar algum game
        luck = MetodsResources.ramndomNumberForLuck(3);

        // inicia o scanner
        Scanner sc = new Scanner(System.in);

        // print da pergunta
        System.out.println("\nQual jogo deseja jogar agora ?\n\n1. Console\n2. Computador\n3. Ursinho\n4. Voltar\n\nDigite a opção que deseja jogar!");
        String gameSelected = sc.nextLine();

        // verrificador
        if (MetodsResources.isConvertibleToInt(gameSelected) == 1) {
            System.out.println("É necessario escolher uma opção");
        } else if (MetodsResources.isConvertibleToInt(gameSelected) == 2) {
            //pega a escolha de comida
            int selectedGame = Integer.parseInt(gameSelected);

            // verifica se o player nn quer voltar
            if (selectedGame == 4) {
                // voltar pro menu
                System.out.println("\nVoltando para o menu principal!\n");
            } else {
                // switch do game
                switchGame(selectedGame);
            }
        } else if (MetodsResources.isConvertibleToInt(gameSelected) == 3) {
            System.out.println("Digite apenas numeros!");
        } else {
            System.out.println("Opção invalida!");
        }
    }
}
