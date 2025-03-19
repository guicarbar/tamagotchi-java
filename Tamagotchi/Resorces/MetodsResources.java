// package
package Tamagotchi.Resorces;

// static functions
import static Tamagotchi.Modules.Status.showStatus;
import static Tamagotchi.Modules.Games.selectGame;
import static Tamagotchi.Modules.Sleep.sleepTime;
import static Tamagotchi.Modules.Hunger.menuSelectFood;
import static Tamagotchi.Modules.Job.workInit;


// import biblioteca
import java.util.Random;


public class MetodsResources {
    // teste para converter para numeros
    public static int isConvertibleToInt(String str) {
        if (str == null || str.isEmpty()) {
            return 1;
        } else {
            try {
                Integer.parseInt(str);
                return 2;
            } catch (NumberFormatException e) {
                return 3;
            }
        }
    }

    // ramndomizar sorte inicial
    public static int ramndomNumberForLuck(int number) {
        // start random
        Random random = new Random();

        // var for luck and return
        int numberReturn = random.nextInt(number);
        return numberReturn;
    }


    // switch do menu principal
    public static void switchMenu(int menuItem) {
        switch (menuItem) {
            case 1:
                // comer
                menuSelectFood();
                break;
            case 2:
                // dormir
                sleepTime();
                break;
            case 3:
                // trabalhar
                workInit();
                break;
            case 4:
                // jogar
                selectGame();
                break;
            case 5:
                // conferir status
                showStatus(CatchName.getName());
                break;
            default:
                System.out.println("\nDigite apenas uma das opções disponiveis!\n");
                break;
        }
    }
}
