import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio18 {
    public static void main(String[] args) {
        DecimalFormat df= new DecimalFormat("0.00");
        double valorReal, valorDolar,cotacao;

        Scanner scanner= new Scanner(System.in);
        System.out.print("Qual é a cotação do Dolár atual? ");
        cotacao  = scanner.nextDouble();

        System.out.print("Qual é o valor EM DÓLAR para a conversão?");
        valorDolar = scanner.nextDouble();

        valorReal = valorDolar*cotacao;

        System.out.println("O valor da cotação em real é de -->R$"+df.format(valorReal));

    }
}
