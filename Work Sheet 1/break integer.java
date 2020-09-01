/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;
 import java.util.Scanner;
/**
 *
 * @author bhara
 */
public class JavaApplication1 {
   
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the number");
        int num=obj.nextInt();
        obj.close();
        int temp,digit,count=0;
        temp=num;
        while(num>0){
            num=num/10;
            count++;
        }
        while(temp>0){
            digit=temp%10;
            System.out.println("number place at"+count+"is"+digit);
            temp=temp/10;
            count--;
        }
        // TODO code application logic here
    }
    
}
