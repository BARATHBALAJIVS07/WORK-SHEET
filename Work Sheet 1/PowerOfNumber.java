/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package power.of.number;

/**
 *
 * @author bhara
 */
public class PowerOfNumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a=2;
        int b=4;
        long result=1;
        for(b=4;b!=0;--b){
            result*=a;
        }
        System.out.println(result);
        // TODO code application logic here
    }
    
}
