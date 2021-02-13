import java.util.Scanner;

public class Calculator{

  public static void main(String[] args) {
       
        System.out.println("Java Calculator");
        System.out.println("***************");
        System.out.println("OPERATION AVAILABLE:");
        System.out.println("Plus: + ");
        System.out.println("Subtract: - ");
        System.out.println("Multiplication: * ");
        System.out.println("Divide: / ");
        System.out.println("Modulo: % ");
        System.out.print("\n");

    	double num1, num2;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number:");

        num1 = scanner.nextDouble();
        System.out.print("Enter second number:");
        num2 = scanner.nextDouble();

        System.out.print("Enter an operator (+, -, *, /, %): ");
        char operator = scanner.next().charAt(0);

        scanner.close();
        double output;

        switch(operator)
        {
            case '+':
            	output = num1 + num2;
                break;

            case '-':
            	output = num1 - num2;
                break;

            case '*':
            	output = num1 * num2;
                break;

            case '/':
            	output = num1 / num2;
                break;
                
            case '%':
            	output = num1 % num2;
                break;

            default:
                System.out.printf("You have entered wrong operator");
                return;
        }

        System.out.println(num1+" "+operator+" "+num2+" = "+output);
 }
}