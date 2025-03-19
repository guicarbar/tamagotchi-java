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

        // quest name
        System.out.println("Qual nome deseja dar para seu Tamagotchi?");
        String nome = sc.nextLine();

        // verificador par o nome
        if (MetodsResources.isConvertibleToInt(nome) == 1) {
            System.out.println("\nÉ necessario digitar um nome!\n");
        } else if (MetodsResources.isConvertibleToInt(nome) == 2) {
            System.out.println("\nApenas letras podem ser usadas!\n");
        } else {
            CatchName.setName(nome);
            System.out.println("\nSeu Tamagotchi recebeu o nome de " + name + "!\n");
        }
    }
}
