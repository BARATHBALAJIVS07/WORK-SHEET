/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package box1;


/**
 *
 * @author bhara
 */
public class Boxs {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        box1 obj=new box1();
        System.out.println(obj.depth);
        box1 obj1=new box1(10,20,30);
        System.out.println(obj1.depth);
        
        // TODO code application logic here
    }
    
    
}

class box1
{
    double height;
    double width;
    double depth;
    box1()
    {
        System.out.println("inside const");
        height=10;
        width=20;
        depth=30;
    }
    box1(double h,double w,double d)
    {
        System.out.println("sec const");
        height=h;
        depth=d;
        width=w;
    }
}
