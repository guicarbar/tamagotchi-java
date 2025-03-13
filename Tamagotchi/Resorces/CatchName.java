package Tamagotchi.Resorces;

// bibliotecas
import java.util.Scanner;

public class CatchName {
    private static String name;

    // getters
    public static String getName() {return name;}

    // setters
    public static void setName(String nome) {name = nome;}

    public static void catchName() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Qual nome deseja dar para seu Tamagotchi ??");
        String nome = sc.nextLine();

        // teste do nome para vazio
        if (nome.isEmpty() == true) {
            setName(nome);
        } else {
            System.out.println("Porfavor digite um nome!");
        }
    }
}
