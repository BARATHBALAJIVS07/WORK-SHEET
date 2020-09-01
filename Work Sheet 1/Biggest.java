/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biggest;
import java.util.Scanner;

/**
 *
 * @author barath balaji
 */
public class Biggest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        Scanner x=new Scanner(System.in);
        System.out.println("enter the first number:");
        int a=x.nextInt();
        System.out.println("enter the second number:");
        int b=x.nextInt();
        System.out.println("enter third number:");
        int c=x.nextInt();
        if(a>b && a>c){
            System.out.println("largest number is :"+a);
        }
        else if(b>c){
            System.out.println("largest number is :"+b);
        }
        else
        {
            System.out.println("largest number is :"+c);
        }
        
        // TODO code application logic here
    }
    
}
