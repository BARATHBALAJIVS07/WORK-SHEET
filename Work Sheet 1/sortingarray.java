/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rmd;

/**
 *
 * @author bhara
 */
public class sortingarray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int []arr={4,5,6,43,55};
        int temp;
        for(int i=0;i<arr.length;i++){
            for(int j=1;j>0;j--){
                if(arr[j]<arr[j-1]){
                    temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }
            }
        }
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        
    }
        // TODO code application logic here
    
    
}
