/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package number.of.postive.negative.and.zero;
import java.util.Scanner;
/**
 *
 * @author bhara
 */
public class NumberOfPostiveNegativeAndZero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int count=0,count1=0,count2=0;
        System.out.println("Enter the number:");
        Scanner obj=new Scanner(System.in);
        int arr[]=new int[10];
        for(int i=0;i<10;i++){
            arr[i]=obj.nextInt();
        }
        for(int i=0;i<10;i++){
            if(arr[i]==0){
                count++;
            }
            else if(arr[i]>0){
                count1++;
            }
            
            else{
                count2++;
            }
        }
        System.out.println("positive number count is "+count1);
        System.out.println("negative number count is "+count2);
        System.out.println("zero count is "+count);
        // TODO code application logic here
    }
    
}
