package Tamagotchi.Modules;

// import resorces
import Tamagotchi.Resorces.MetodsResources;

// bibliotecas
import java.util.Scanner;

public class Ursinho extends Games {
    // iniciando game
    public static void ursinhoGame() {
        // inicializador do ursinho
        MetodsResources.timer(5, 3);

        // inicando o scanner
        Scanner sc = new Scanner(System.in);

        System.out.println("Qunato deseja apostar hoje ?\n1. RS5,00\n2. RS10,oo\n3. 3. RS15,oo\n4. RS20,00\n5. Voltar");
        String valueOptions = sc.nextLine();
    }
}
