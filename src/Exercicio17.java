import java.util.Scanner;

public class Exercicio17 {
    public static void main(String[] args) {
        double volume,comprimento,largura,altura;

        Scanner sc= new Scanner(System.in);

        System.out.println("Bem Vindo ao programa para calcular o volume de uma caixa regular :)");
        System.out.print("Digite o valor do comprimento-->");
        comprimento = sc.nextDouble();
        System.out.print("Digite o valor da largura -->");
        largura = sc.nextDouble();
        System.out.print("Digite o valor da altura -->");
        altura = sc.nextDouble();

        volume= comprimento*largura*altura;

        System.out.println("O valor do volume é -->" + volume);

    }
}
