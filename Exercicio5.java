package exercicio5;

import java.util.Scanner;


public class Exercicio5 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite a medida em metros: ");
        double medidaMetro = teclado.nextDouble();
        System.out.println(medidaMetro+" m equivale a "+medidaMetro*100+" cm");
        
    }
    
}
