/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simplecalculator;
import java.util.Scanner;
/**
 *
 * @author bhara
 */
public class Simplecalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the number");
        double a=obj.nextDouble();
        double b=obj.nextDouble();
        System.out.println("operator +,-,*,/ :");
        char operator=obj.next().charAt(0);
        double result;
        switch(operator){
            case '+':
                result=a+b;
                break;
            case '*':
                result=a*b;
                break;
            case '-':
                result=a-b;
                break;    
            case '/':
                result=a/b;
                break;
            default:
                System.out.println("Error!The operator is incorrect");
                return;
                
        }
        System.out.println(+a+" "+operator+" "+b+"="+result);
        
        // TODO code application logic here
    }
    
}
