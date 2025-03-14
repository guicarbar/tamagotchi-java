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

    public static int ramndomNumberForLuck() {
        Random random = new Random();
        int luck = random.nextInt(3);
        return luck;
    }
}
