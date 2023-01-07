//faça um programa que pergunte quando voce ganha por hora e o numero de horas trabalhadas no mês. 
//calcule e mostre o total do seu salario no referido mes
import java.util.Scanner;
public class exercicio8 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Quanto voce ganha por hora trabalhada? ");
        double hora = scan.nextDouble();

        System.out.println("Quantas horas voce trabalha por mes? ");
        double horasMes = scan.nextDouble();

        double total = hora * horasMes;
        System.out.println("O valor do seu salario eh de: " + total);



    }
    
}
