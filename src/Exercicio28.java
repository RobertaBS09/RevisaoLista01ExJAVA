import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio28 {
    public static void main(String[] args) {
        DecimalFormat df =new DecimalFormat("0,00");
        Scanner sc = new Scanner(System.in);

        double capital,juros,montante;
        int meses;

        System.out.print("Digite o valor do capital investido --->");
        capital= sc.nextDouble();
        System.out.print("Em quantos meses esse valor foi investido? ");
        meses= sc.nextInt();
        System.out.print("Digite a taxa de juros ---> ");
        juros= sc.nextDouble();

        montante=capital*(Math.pow(1+(juros/100),meses));

        System.out.println("O valor do montante é de R$"+df.format(montante));


    }
}
