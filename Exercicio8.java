package exercicio8;

import java.util.Scanner;


public class Exercicio8 {

   
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite a quantidade de horas que você trabalha por mês: ");
        double horas = teclado.nextDouble();
        System.out.print("Digite o quanto você ganha por hora trabalhada: ");
        double precoHora = teclado.nextDouble();
        System.out.println("O salário final é R$"+horas*precoHora);
        
    }
    
}
