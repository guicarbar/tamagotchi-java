// import de bibliotecas
import java.util.Scanner;

// imports resources
import Tamagotchi.Resorces.CatchName;
import Tamagotchi.Resorces.MetodsResources;

// imports modules
import Tamagotchi.Modules.Status;
import Tamagotchi.Modules.Games;


// main function
public class Main {
    public static void main(String[] args) {
        // abre o scanner
        Scanner sc = new Scanner(System.in);

        // init area
        boolean start = true;

        do {
            System.out.println("Pressione Enter para começar a jogar");
            String startTest = sc.nextLine();

            if (MetodsResources.isConvertibleToInt(startTest) == 1) {
                start = false;
                System.out.println("\nIniciando game!\n");
            } else {
                System.out.println("\nQuando estiver pronto digite Enter!\n");
            }
        } while (start == true);

        // nomeando tamagotchi
        CatchName.catchName();

        // start menu
        System.out.println("\nDigite o número da ação desejada:\n\n1. Comer\n2. Dormir\n3. Trabalhar\n4. Jogar\n5. Conferir status\n6. Sair\n");


        // setando os status iniciais para o tomagotchi
        Status.setHumor(100);
        Status.setHunger(100);
        Status.setSleep(100);
        Status.setWallet(100);

        // iniciar o game
        Games.selectGame();

        // reduzir os status meno a carteira
        // Status.reduxStatsPerAction(90,60,20);

        // show stats - passa op name do tamagotchi
        Status.showStatus(CatchName.getName());

        // encerra o scanner
        sc.close();
    }
}
