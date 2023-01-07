//faça um programa que peça o tamanho de um arquivo para download (em MB) e a velocidade de um link
//de internet (em Mbps), calcule e informe o tempo aproximado do download do arquivo usando este link 
//(em minutos)

import java.util.Scanner;
public class exercicio14 {
    public static void main(String[] args) {
        
    Scanner scan = new Scanner(System.in);

    System.out.println("Entre com o tamanho do arquivo: ");
    double tamArquivo = scan.nextDouble();

    System.out.println("Entre com a velocidade da internet: ");
    double velocidade = scan.nextDouble();

    double tempo = tamArquivo / velocidade;
    System.out.println("Tempo de download eh: " + tempo);

    }
}
