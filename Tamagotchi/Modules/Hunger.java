package Tamagotchi.Modules;

// import resources
import Tamagotchi.Resorces.MetodsResources;
import Tamagotchi.Modules.Wallet;

// import bibbliotecas
import java.util.Scanner;

public class Hunger extends Status {
    // switch da comida
    public static void switchFood(int optionSelected) {
        // set value
        double price = 0.0;
        int varHumor = 0;
        int varHunger = 0;

        // switch da escolha
        switch (optionSelected) {
            case 1:
                price = 12.00;
                varHunger = 30;
                varHumor = 10;
                break;
            case 2:
                price = 8.00;
                varHunger = 15;
                varHumor = 15;
                break;
            case 3:
                price = 15.00;
                varHunger = 25;
                varHumor = 10;
                break;
            case 4:
                price = 25.00;
                varHunger = 40;
                varHumor = 25;
                break;
            case 5:
                price = 5.00;
                varHunger = 5;
                varHumor = 15;
                break;
            case 6:
                price = 7.00;
                varHunger = 10;
                varHumor = 25;
                break;
            default:
                System.out.println("\nDigite apenas uma das opções disponiveis!\n");
                break;
        }

        if (Wallet.haveMoney(price) == true) {
            // comer comida
            Wallet.removeCash(price);
            humor += varHumor;
            hunger += varHunger;
            System.out.println("\nUhuuum que incrivel!");
        } else {
            System.out.println("\nVocé não tem dinheiro o suficiete! vá trabalhar!\n");
        }
    };

    // seleciona a comida
    public static void menuSelectFood() {
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
                System.out.println("\nVoltando para o menu principal!\n");
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
