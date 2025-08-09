import java.util.Scanner;

public class SimpleCalculator {

public static void main(String[] args) {

Scanner scanner = new Scanner(System.in);

System.out.print("Enter first number: ");

double num1 = scanner.nextDouble();

System.out.print("Enter second number: ");

double num2 = scanner.nextDouble();

System.out.print("Enter operation (+, -,*,/): ");

char operation = scanner.next().charAt(0);

double result;

switch (operation) {

case '+': result= num1 + num2; break:

case '-': result = num1-num2; break;

case '*': result= num1* num2; break:

case '/': result = num1/num2; break;

default: throw new IllegalArgumentException("Invalid operation");

}

System.out.printIn("Result: "+ result);

}

}
