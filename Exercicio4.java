package exercicio4;

import java.util.Scanner;

public class Exercicio4 {

   
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite a nota do primeiro bimestre: ");
        double nota1 = teclado.nextDouble();
        System.out.print("Digite a nota do segundo bimestre: ");
        double nota2 = teclado.nextDouble();
        System.out.print("Digite a nota do terceiro bimestre: ");
        double nota3 = teclado.nextDouble();
        System.out.print("Digite a nota do quarto bimestre: ");
        double nota4 = teclado.nextDouble();
        System.out.println("A média do estudante é : "+(nota1+nota2+nota3+nota4)/4);
    }
    
}
