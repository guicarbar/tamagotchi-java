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
            System.out.println("\nPressione Enter para começar a jogar!");
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

        // Abrindo tamagotchi
        System.out.println("\nTamagotchi abrindo!");

        // settando vars iniciais do tamagotchi
        Status.setHumor(60);
        Status.setHunger(60);
        Status.setSleep(60);
        Status.setWallet(40);


        // set menu area
        boolean menuBoleans = true;

        // init menu area
        do {
            System.out.println("\nDigite o número da ação desejada:\n\n1. Comer\n2. Dormir\n3. Trabalhar\n4. Jogar\n5. Conferir status\n6. Sair");
            String menuSelected = sc.nextLine();

            // comparate
            if (MetodsResources.isConvertibleToInt(menuSelected) == 1) {
                System.out.println("\nÉ necessario escolher uma opção!\n");
            } else if (MetodsResources.isConvertibleToInt(menuSelected) == 2) {
                //pega a escolha do menu
                int numberMenuSelect = Integer.parseInt(menuSelected);

                // verifica se o player nn quer voltar
                if (numberMenuSelect == 6) {
                    // fechar o game
                    menuBoleans = false;
                } else {
                    MetodsResources.switchMenu(numberMenuSelect);

                    // redux 5 point por general action
                    Status.reduxPerAction();
                }
            } else if (MetodsResources.isConvertibleToInt(menuSelected) == 3) {
                System.out.println("\nDigite apenas numeros!\n");
            } else {
                System.out.println("\nOpção invalida!\n");
            }
        } while (menuBoleans == true);


        System.out.println("\n\nFechando game!\n\nAdeus " + CatchName.getName() + "!\n\n");

        // encerra o scanner
        sc.close();
    }
}
