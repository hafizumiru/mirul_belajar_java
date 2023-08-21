import java.util.Scanner;

public class Mathclass {
    public static void main(String[] args) {
        
        double x = 3.14;
        double y = -10;
        double z = 25;

        double a = Math.max(x, y); //membandingkan yg paling besar
        double b = Math.min(x, y); //membandingkan yg paling kecil
        double c = Math.abs(y); //nilai absolut
        double d = Math.sqrt(z); //akar dari
        double e = Math.round(x); //dibulatkan paling mendekati
        double f = Math.ceil(x); //dibulatkan keatas
        double g = Math.floor(x); //dibulatkan kebawah
        double h = Math.pow(x, z); 
        

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);
        System.out.println(h);

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter side x = ");
        double xx = scanner.nextDouble();
        System.out.println("Enter side y = ");
        double yy = scanner.nextDouble();
        
        double aa = Math.sqrt((xx*xx)+(yy*yy)); //akar dari
        double bb = Math.round(aa); //dibulatkan paling mendekati
        double cc = Math.ceil(aa); //dibulatkan keatas
        double dd = Math.floor(aa); //dibulatkan kebawah

        System.out.println(aa);
        System.out.println(bb);
        System.out.println(cc);
        System.out.println(dd);

    }
}
