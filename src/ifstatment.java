import java.util.Scanner;

public class ifstatment {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
    
        
        System.out.println("Input your age: ");
        int age = scanner.nextInt(); 
        if(age > 21){

            System.out.println("You are an adult");

        }
        else if(12 <= age && age <= 21){

            System.out.println("You are an teenager");
        }
        else{
            System.out.println("You are a kid");
        }

    }

}