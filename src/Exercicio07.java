import java.text.DecimalFormat;

public class Exercicio07 {
    public static void main(String[] args) {
        int a,b,c;
        double d,xa,xb,xc,xd,xe,xf;
        DecimalFormat df = new DecimalFormat("0.00");
        a=3;
        b=8;
        c= -6;
        d=2.5;

        xa= -c *2*a%3+c;
        xb =Math.sqrt(-6*c)/4%b;
        xc=30/a/2+Math.pow(8,2) / 2 % c;
        xd= 34 % b % 5 * Math.pow(2,3)% b *-1 / (a+c);
        xe=Math.pow(-c,2) + d *10/ a;

        System.out.println("a)" + xa + "\nb)" + xb + "\nc)" +xc+ "\nd)" +xd + "\ne)" + xe);
    }
}
