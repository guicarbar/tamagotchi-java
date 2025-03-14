package Tamagotchi.Resorces;

// bibliotecas
import java.util.Scanner;

public class CatchName {
    // settando name como variavel
    private static String name;

    // getters and setter of name
    public static String getName() {return name;}
    public static void setName(String nome) {name = nome;}


    // catch firt time name
    public static void catchName() {
        // inicaindo o scanner
        Scanner sc = new Scanner(System.in);

        System.out.println("Qual nome deseja dar para seu Tamagotchi?");
        String nome = sc.nextLine();

        // teste do nome para vazio
        if (nome.isEmpty() == true) {
            setName(nome);
        } else {
            System.out.println("Porfavor digite um nome!");
        }
    }

    // rename function
    public static void renamePet() {
        // inicaiando scanner
        Scanner sc = new Scanner(System.in);

        System.out.println("Qual o novo nome para seu Tamagotchi?");
        String nome = sc.nextLine();

        // teste do nome para vazio
        if (nome.isEmpty() == true) {
            setName(nome);
        } else {
            System.out.println("Porfavor digite um nome!");
        }
    }
}
