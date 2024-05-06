package calculator;

import java.util.Scanner;

/**
 *
 * @Samukelisiwe maphumulo
 */
public class calc {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
         //read the first integer
        System.out.print("Enter first number: ");
        int num1 = scan.nextInt();
        
        //read second integer
        System.out.print("Enter second number: ");
        int num2 = scan.nextInt();
        
        //The user will choose the operation of  his/her choice A=add, M=multiply, D=divide, S=subtract
       
        System.out.print("Enter character(+,-,*,/): ");
        char operations =scan.next().charAt(0);
        
        //if the user want to add the intergers 
        if(operations == '+'){ 
            System.out.println("The Answer is: " + (num1 + num2));
        }
        
        //if the user want to subtract the interger
        else if(operations == '-') {
            System.out.println("The Answer is: " + (num1 - num2));
        }
        
        // if the user want to Multiply the intergers
        else if(operations == '*') {
            System.out.println("The Answer is: " + (num1 * num2));
        }
        
        //if the user want to devide the intergers
        else if(operations == '/') {
            System.out.println("The Answer is: " + (num1 / num2));
        }
        // if the user intered the incorrect oparator
        else {
            System.out.println("Enter valid operation!!!");
        }
        
        // TODO code application logic here
    }
    
}
