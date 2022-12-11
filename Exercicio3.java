package exercicio3;

import java.util.Scanner;

/**
 *
 * @author thiago
 */
public class Exercicio3 {

    public static void main(String[] args) {
        Scanner teclado= new Scanner(System.in);
        System.out.print("Digite o primeiro número: ");
        double num1 = teclado.nextDouble();
        System.out.print("Agora digite o segundo número: ");
        double num2 = teclado.nextDouble();
        System.out.println("A soma dos dois números é : "+(num1+num2));
    }
    
}
