import java.util.Scanner;

public class Exercicio20 {
    public static void main(String[] args) {
        int v1,v2,v3,v4,result1,result2;

        Scanner sc= new Scanner(System.in);

        System.out.print("Digite o primeiro valor: ");
        v1=sc.nextInt();
        System.out.print("Digite o segundo valor: ");
        v2=sc.nextInt();
        System.out.print("Digite o terceiro valor: ");
        v3=sc.nextInt();
        System.out.print("Digite o quarto valor: ");
        v4=sc.nextInt();

        result1=v1*v3;
        result2= v2+v4;

        System.out.println("Os valores são: " + result1 + " e " + result2);

    }
}
