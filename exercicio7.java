//faça um programa que calcule a area de um quadrado, em seguida mostre o dobro desta area para o usuario
import java.util.Scanner;

public class exercicio7 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o valor do lado do quadrado: ");
        double lado = scan.nextDouble();

        double area = Math.pow(lado, 2);
        System.out.println("A area do quadrado eh " + area);
        double dobro = area * 2;
        System.out.println("O dobro da area eh " + dobro);


    }
    
}
