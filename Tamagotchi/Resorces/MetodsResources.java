package Tamagotchi.Resorces;

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
}
