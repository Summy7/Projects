import java.util.Scanner;

public class calculator {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a number: ");
        
        int num_1 = scan.nextInt();
        
        System.out.print("Enter a number: ");

        int num_2 = scan.nextInt();

        System.out.print("Enter an operation: ");

        String operation = scan.next();
        
        if(operation.equals("+")) {
            System.out.println("You're number is " + (num_1 + num_2));
        }
        if(operation.equals("-")) {
            System.out.println("You're number is " + (num_1 - num_2));
        }
        if(operation.equals("*")) {
            System.out.println("You're number is " + (num_1 * num_2));
        }
        if(operation.equals("/")) {
            System.out.println("You're number is " + (num_1 / num_2));
        }

    }
}    