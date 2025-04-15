import java.util.Scanner;

public class Exercicio21 {
    public static void main(String[] args) {
        double salario,reajuste,nvsalario,contarea;
        Scanner sc= new Scanner(System.in);
        System.out.print("Digite o valor do salário mensal-->");
        salario= sc.nextDouble();
        System.out.print("Dite o valor da porcentagem de reajuste -->");
        reajuste= sc.nextDouble();

        contarea= salario*(reajuste/100);
        nvsalario= salario + reajuste;

        System.out.print("O novo salário é --> R$" + nvsalario);
    }
}
