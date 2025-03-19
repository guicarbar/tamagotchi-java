package Tamagotchi.Modules;

// import bibliotecas
import java.util.Scanner;

// import resources
import Tamagotchi.Resorces.MetodsResources;

public class Sleep extends Status {
    // swich slepp
    public static void switchSleep(int sleepTime) {
        switch (sleepTime) {
            case 1:
                // cochilo
                sleep += 30;
                hunger -= 20;
                break;
            case 2:
                // sono mormal
                sleep += 60;
                hunger -= 45;
                break;
            case 3:
                // sono longo
                sleep += 90;
                hunger += 65;
                break;
            default:
                System.out.println("\nDigite apenas uma das opções disponiveis!\n");
        }
    }


    // how much you go to sleep
    public static void sleepTime() {
        // inicia o scanner
        Scanner sc = new Scanner(System.in);

        // escolha de tempo for sleep
        System.out.println("\nQuanto tempo deseja dormir ?\n\n1. Um cochilo de 2 horas.\n2. Uma noite de sono de 7 horas.\n3. Um sono muito pesado de 10 horas.\n4. Voltar.");
        String optionSleep = sc.nextLine();

        if (MetodsResources.isConvertibleToInt(optionSleep) == 1) {
            System.out.println("\nÉ necessario escolher uma opção\n");
        } else if (MetodsResources.isConvertibleToInt(optionSleep) == 2) {
            //pega a escolha de comida
            int selectedSleepTime = Integer.parseInt(optionSleep);

            // verifica se o player nn quer voltar
            if (selectedSleepTime == 4) {
                // voltar pro menu
                System.out.println("\nVoltando para o menu principal!\n");
            } else {
                // switch do game
                switchSleep(selectedSleepTime);
            }
        } else if (MetodsResources.isConvertibleToInt(optionSleep ) == 3) {
            System.out.println("\nDigite apenas numeros\n");
        } else {
            System.out.println("\nOpção invalida!\n");
        }
    }
}
