/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab10;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author barathbalaji
 */
public class characterstream {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        FileReader r=NULL;
        FileWriter w=NULL;
        try{
            r=new FileReader("C:\\Users\\user\\Documents\\NetBeansProjects\\lab10\\src\\lab10\\input.jpg");
            w=new FileWriter("C:\\Users\\user\\Documents\\NetBeansProjects\\lab10\\src\\lab10\\output.jpg");
            int c;
            while ((c=read())!=-1){
                w.write(c);
            }
        }finally{
            if(r!=NULL){
                r.close();
            }
            if(w!=NULL){
                w.close();
            }
        }
    }
    
}
