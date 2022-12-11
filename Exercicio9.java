package exercicio9;

import java.util.Scanner;

public class Exercicio9 {

    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite a temperatura em graus Fahrenheit: ");
        double temperatura = teclado.nextDouble();
        System.out.println(temperatura+" graus Fahrenheit em Celsius equivalem a "+5 * ((temperatura-32) / 9)+" °C");
    }
    
}
