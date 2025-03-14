// import de bibliotecas
import java.util.Scanner;

// imports resources
import Tamagotchi.Resorces.TextResources;
import Tamagotchi.Resorces.CatchName;

// imports modules
import Tamagotchi.Modules.Status;
import Tamagotchi.Modules.Sleep;


// main function
public class Main {
    public static void main(String[] args) {
        // abre o scanner
        Scanner sc = new Scanner(System.in);

        // nomeando tamagotchi
        CatchName.catchName();

        // start menu
        System.out.println(TextResources.quests[0]);


        // setando os status iniciais para o tomagotchi
        Status.setHumor(100);
        Status.setHunger(100);
        Status.setSleep(100);
        Status.setWallet(100);

        // reduzir os status meno a carteira
        // Status.reduxStatsPerAction(90,60,20);

        // show stats - passa op name do tamagotchi
        Status.showStatus(CatchName.getName());

        // encerra o scanner
        sc.close();
    }
}
