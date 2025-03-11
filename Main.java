// import de bibliotecas
import java.util.Scanner;

// imports resources
import Tamagotchi.Resorces.TextResources;

// imports modules
import Tamagotchi.Modules.Status;
import Tamagotchi.Modules.Sleep;


// main function
public class Main {
    public static void main(String[] args) {
        // abre o scanner
        Scanner sc = new Scanner(System.in);

        // start menu
        System.out.println(TextResources.quests[0]);


        // setando os status iniciais para o tomagotchi
        Status.setHumor(100);
        Status.setHunger(100);
        Status.setSleep(100);
        Status.setWallet(100);

        Sleep.removeSleep(100);

        // reduzir os status meno a carteira
        // Status.reduxStatsPerAction(90,60,20);

        Status.showStatus();

        // encerra o scanner
        sc.close();
    }
}
