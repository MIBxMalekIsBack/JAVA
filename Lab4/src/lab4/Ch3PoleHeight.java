/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4;

import java.util.*;
import java.text.*;
public class Ch3PoleHeight {
    public static void main(String[] args){
        double height;
        double distance;
        double alpha;
        double beta;
        double alphaRad;
        double betaRad;
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Angle alpha (in degree): ");
        alpha = input.nextDouble();
        
        System.out.print("Angle beta (in degree): ");
        beta = input.nextDouble();
        
        System.out.print("Distance between points A and B (ft): ");
        distance = input.nextDouble();
        
        alphaRad = Math.toRadians(alpha);
        betaRad = Math.toRadians(beta);
        
        height = (distance*Math.sin(alphaRad)*Math.sin(betaRad))
                /
                Math.sqrt(Math.sin(alphaRad + betaRad)*
                        Math.sin(alphaRad - betaRad));
        DecimalFormat df = new DecimalFormat ("0.000");
        System.out.println("\n\nEstimating the height of the pole"
            + "Angle at point A (deg): "+df.format(alpha)+"\n"
            +"Angle at point B (deg) : "+df.format(beta)+"\n"
            +"Distance between A and B (ft): "+df.format(distance)+"\n"
            +"Estimated height(ft): "+df.format(height));
        
    }
    
}
