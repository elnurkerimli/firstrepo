import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        char operator;
        Double number1, number2, result;


        Scanner input = new Scanner(System.in);


        System.out.println("Please Enter Operator: +, -, *, or /");
        operator = input.next().charAt(0);


        System.out.println("Enter First Count");
        number1 = input.nextDouble();

        System.out.println("Enter Second Count");
        number2 = input.nextDouble();

        switch (operator) {


            case '+':
                result = number1 + number2;
                System.out.println("RESULT :"+number1 + " + " + number2 + " = " + result);
                break;


            case '-':
                result = number1 - number2;
                System.out.println("RESULT :"+number1 + " - " + number2 + " = " + result);
                break;


            case '*':
                result = number1 * number2;
                System.out.println("RESULT :"+number1 + " * " + number2 + " = " + result);
                break;


            case '/':
                result = number1 / number2;

                if (number2==0) {
                    System.out.println("RESULT: "+number1 + " / " + number2 + " = ERROR OPERATION!");
                    break;
                }
                System.out.println("RESULT :"+number1 + " / " + number2 + " = " + result);
                break;

            default:
                System.out.println("ERROR OPERATION!");
                break;
        }

        input.close();
    }
}