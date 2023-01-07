import java.util.Scanner;

//faça um programa que peça um número e então mostre a mesangem O numero informado foi (numero).
public class exercicio2 {
    public static void main(String[] args){
        Scanner scan = new Scanner (System.in);

        System.out.println("Digite um número coom valor inteiro: ");
        int numero = scan.nextInt();
        System.out.println("O numero informado foi: " + numero);

    }
    
}
