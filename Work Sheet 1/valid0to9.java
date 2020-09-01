/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package valid;
import java.util.Scanner;

/**
 *
 * @author bhara
 */
public class valid0to9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the number:");
        int n=obj.nextInt();
        switch(n){
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                System.out.println("The number is valid :"+n);
                break;
            default:
                System.out.println("invalid number");
        }
        // TODO code application logic here
    }
    
}
