package exercicio7;

import java.util.Scanner;

public class Exercicio7 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite o valor da medida do lado do quadrado: ");
        double lado = teclado.nextDouble();
        System.out.println("O dobro da área do quadrado é: "+Math.pow(lado,2)*2+" u²");
    }
    
}
