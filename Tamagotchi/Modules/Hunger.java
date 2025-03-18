package Tamagotchi.Modules;

// import resources
import Tamagotchi.Resorces.MetodsResources;

// import bibbliotecas
import java.util.Scanner;

public class Hunger extends Status {
    public static void addHunger(int hungerPoints) {
        hunger += hungerPoints;
    }

    public static void removeHunger(int hungerPoints) {
        hunger -= hungerPoints;
    }

    public static void analyserHunger(String name) {
        if (hunger > 100) {
            hunger = 100;
            System.out.println("\n" + name + " já se sente cheio, ele não precisa comer mais por um tempo!\n");
        } else if (hunger <= 0) {
            System.out.println("\n" + name + " morreude fome!\n");
        }
    }

    // switch da comida
    public static void switchFood(int optionSelected) {
        // set value
        double price = 0.0;

        // switch da escolha
        switch (optionSelected) {
            case 1:
                price = 12.00;
                break;
            case 2:
                price = 8.00;
                break;
            case 3:
                price = 15.00;
                break;
            case 4:
                price = 25.00;
                break;
            case 5:
                price = 5.00;
                break;
            case 6:
                price = 7.00;
                break;
            default:
                System.out.println("\nDigite apenas uma das opções disponiveis!\n");
        }

        if (!Wallet.haveMoney(price)) {
            // comer comida
        } else {
            System.out.println("\nVocé não tem dinheiro o suficiete! vá trabalhar!\n");
        }
    };

    // seleciona a comida
    public static void menuSelect() {
        // start scanner
        Scanner sc = new Scanner(System.in);

        // start cardapio
        System.out.println("\nQual sua escolha para comer hoje?\n\n1. Prato feito: R$ 12,00\n2. Hambúrguer simples: R$ 8,00\n3. Hambúrguer duplo: R$ 15,00\n4. Pizza: R$ 25,00\n5. Refrigerante: R$ 5,00\n6. Chocolate: R$ 7,00\n7. Voltar\n\nDigite a opção que deseja comer!\n");
        String optionFood1 = sc.nextLine();

        // verificador
        if (MetodsResources.isConvertibleToInt(optionFood1) == 1) {
            System.out.println("\nÉ necessario escolher uma opção!\n");
        } else if (MetodsResources.isConvertibleToInt(optionFood1) == 2) {
            //pega a escolha de comida
            int optionFood2 = Integer.parseInt(optionFood1);

            // verifica se o player nn quer voltar
            if (optionFood2 == 7) {
                // voltar pro menu
            } else {
                switchFood(optionFood2);
            }
        } else if (MetodsResources.isConvertibleToInt(optionFood1) == 3) {
            System.out.println("\nDigite apenas numeros!\n");
        } else {
            System.out.println("\nOpção invalida!\n");
        }
    }
}
