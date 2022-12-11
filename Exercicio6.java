package exercício6;

import java.util.Scanner;

public class Exercício6 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite a medida do raio de um círculo: ");
        double raio = teclado.nextDouble();
        double area = Math.PI*Math.pow(raio, 2);
        System.out.println("O círculo de raio "+raio+" tem uma área igual a "+area+" u²");
    }
    
}
