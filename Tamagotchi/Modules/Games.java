package Tamagotchi.Modules;

// import resorces
import Tamagotchi.Resorces.MetodsResources;
import Tamagotchi.Resorces.TextResources;
import Tamagotchi.Modules.Wallet;

// import biblioteca
import java.util.Scanner;

public class Games {
    // luck of tamagotchi
    static int luck = MetodsResources.ramndomNumberForLuck();

    // switch game selected
    public static void switchGame(int game) {
        switch (game) {
            case 1:
                // console
                break;
            case 2:
                // computador
                break;
            case 3:
                // ursinho
                break;
            case 4:
                luck = MetodsResources.alterLuck();
                Wallet.removeCash(1.00);
                System.out.println("Vocé jogou uma moeda no poço, a sorte de seu Tamagotchi muda!");
                break;
            default:
                System.out.println("Digite apenas uma das opções disponiveis!");
                break;
        }
    }


    // metodo pra escolher o game pra rodar
    public static void selectGame() {
        // inicia o scanner
        Scanner sc = new Scanner(System.in);

        // print da pergunta
        System.out.println(TextResources.quests[2]);
        String gameSelected = sc.nextLine();

        // verrificador
        if (MetodsResources.isConvertibleToInt(gameSelected) == 1) {
            System.out.println("É necessario escolher uma opção");
        } else if (MetodsResources.isConvertibleToInt(gameSelected) == 2) {
            //pega a escolha de comida
            int selectedGame = Integer.parseInt(gameSelected);

            // verifica se o player nn quer voltar
            if (selectedGame == 5) {
                // voltar pro menu
            } else {
                // switch do game
                switchGame(selectedGame);
            }
        } else if (MetodsResources.isConvertibleToInt(gameSelected) == 3) {
            System.out.println("Digite apenas numeros");
        } else {
            System.out.println("Opção invalida!");
        }
    }
}
