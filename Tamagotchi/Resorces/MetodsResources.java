package Tamagotchi.Resorces;

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
    public static int ramndomNumberForLuck() {
        // start random
        Random random = new Random();

        // var for luck and return
        int luck = random.nextInt(3);
        return luck;
    }

    // alterar a sorte
    public static int alterLuck() {
        // start random
        Random random = new Random();

        // var for luck and return
        int luck = random.nextInt(3);
        return luck;
    }
}
