/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Calc {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner calc = new Scanner(System.in);
        double num1, num2;
        System.out.print("Enter first number:");

        /* We are using data type double so that user
         * can enter integer as well as floating point
         * value
         */
        num1 = calc.nextDouble();
        System.out.print("Enter second number:");
        num2 = calc.nextDouble();

        System.out.print("Enter the operator (+, -, *, /): ");
        char operator = calc.next().charAt(0);

        calc.close();
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

            /* If user enters any other operator or char apart from
             * +, -, * and /, then display an error message to user
             * 
             */
            default:
                System.out.printf("You have entered incorrect operator");
                return;
        }

        System.out.println(num1+" "+operator+" "+num2+": "+output);
    }
    
}
