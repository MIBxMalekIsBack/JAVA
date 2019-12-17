/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5;

/**
 *
 * @author ABDUL MALEK
 */
public class Calculation {
    public static void main (String[] args){
        final double PI = 3.142;  //declare constant
        double radius = 0.0, area=0.0;
        int base,height;
        
        Shape circle = new Shape(); //creating an obejct variable
        Shape triangle = new Shape();
        
        System.out.println("Calculate Circle");
        radius = circle.acceptRadius(); //using the acceptradius method
        area = PI*Math.pow(radius, 2);
        System.out.println("The area for the circle is "+area+"\n");
        
        System.out.println("Calculate Triangle");
        base = triangle.acceptBase();
        height = triangle.acceptHeight();
        area = 0.5*base*height;
        System.out.println("The area for triangle is "+area);
    }
}
