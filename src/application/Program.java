package application;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos numeros voce vai digitar? ");
        int numMax = sc.nextInt();
        sc.nextLine();
        
        int[] numbers = new int[numMax];

        for (int i = 0; i < numMax; i++) {
            System.out.println("Digite um Numero: ");
            numbers[i] = sc.nextInt();
        }

        System.out.println("Os numeros negativos sao: ");
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < 0) {
                System.out.println(numbers[i]);
            }
        }

    }
}
