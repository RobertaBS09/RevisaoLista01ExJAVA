import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio26 {
    public static void main(String[] args) {
        DecimalFormat df= new DecimalFormat("0,0000");
        Scanner sc= new Scanner(System.in);

        double x,y;

        System.out.print("Digite o valor de X: ");
        x= sc.nextDouble();

        y= x+(10/(Math.sqrt(4+x*x)));

        System.out.println("Y=" +df.format(y));
    }
}
