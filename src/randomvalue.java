import java.util.Random;

public class randomvalue {
    public static void main(String[] args) {
        
        Random random = new Random();

        int x = random.nextInt(10)+1;           // (+1) adalah agar untuk random number diatas tidak mengikutsertakan angka 0 
        double y = random.nextDouble(10)+1;     // karna angka 0 terhitung angka
        boolean z = random.nextBoolean();

        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
    }
}
