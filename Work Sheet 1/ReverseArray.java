/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reverse.array;
import java.util.Scanner;
/**
 *
 * @author bhara
 */
public class ReverseArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int arr[]=new int[5];
        System.out.println("oringal array");
        for(int i=0;i<arr.length;i++){
            arr[i]=obj.nextInt();
        }
        System.out.println("Reversed array");
        for(int i=arr.length-1;i>=0;i--){
            System.out.println(arr[i]);
        }
        // TODO code application logic here
    }
    
}
