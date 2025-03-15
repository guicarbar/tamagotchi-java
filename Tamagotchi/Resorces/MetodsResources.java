package Tamagotchi.Resorces;

//
import Tamagotchi.Resorces.CatchName;

// import biblioteca
import java.util.Random;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

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

    // alterar a sorte
    public static int alterLuck() {
        // start random
        Random random = new Random();

        // var for luck and return
        int luck = random.nextInt(3);
        return luck;
    }

    // options for metod for timer
    public static void metodForTimer(int metod, String nome) {
        switch (metod) {
            case 1:
                System.out.println("\nIniciando console ...\n");
                System.out.println(nome + "Começou a jogar!\n");
                System.out.println("\nApós 5 horas jogando no console," + nome + " fica cansado e decide parar de jogar!\n");
                break;
            case 2:
                System.out.println("\nIniciando computador ...\n");
                System.out.println(nome + "Começou a jogar!\n");
                System.out.println("\nApós 7 horas jogando no computador," + nome + " fica cansado e decide parar de jogar!\n");
                break;
            case 3:
                System.out.println("\nIniciando Ursinho! Vamos apostar hoje ? ...\n");
                System.out.println("Ursinho iniciado!");
                break;
            default:
                System.out.println("\nErro\n");
                break;
        }
    }

    // metod de timer
    public static void timer(int time, int metod) {
        // inicia o sche com 1 poolcore
        ScheduledExecutorService sche = Executors.newScheduledThreadPool(1);

        // tarefa que ira ser executada
        Runnable task = () -> metodForTimer(metod, CatchName.getName());

        // executa o timer dps de tanto tempo
        sche.schedule(task, time, TimeUnit.SECONDS);

        // encerra o sche
        sche.shutdown();
    }
}
