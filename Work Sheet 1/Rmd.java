/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rmd;
import java.util.Random;
/**
 *
 * @author bhara
 */
public class Rmd {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random rn = new Random();
        //int result = rn.nextInt(10) + 1;
        //System.out.println("Random generated:"+result);
        System.out.println((int)(Math.random()*10));
        // TODO code application logic here
    }
    
}
